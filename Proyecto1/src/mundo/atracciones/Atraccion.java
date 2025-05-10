package atracciones;
import java.util.List;
import java.time.LocalDate;
import usuario.Empleado;
import lugares.LugarTrabajo;

public abstract class Atraccion implements LugarTrabajo {
	
	protected String nombre;
    protected  int capacidadMax;
    protected  int empleadosMin;
    protected  String ubicacion;
    protected  String nivelEsclusividad;
    protected List<Empleado> empleadosAsignados;
    protected  boolean esDeTemporada;
    protected  LocalDate fechaInicioTemporada; 
    protected  LocalDate fechaFinTemporada;   
    protected String CondicionClimatica;
    
    
 
	public Atraccion(String nombre, int capacidadMax, int empleadosMin, String ubicacion, String nivelEsclusividad,
			List<Empleado> empleadosAsignados, boolean esDeTemporada, LocalDate fechaInicioTemporada,
			LocalDate fechaFinTemporada, String condicionClimatica) {
		super();
		this.nombre = nombre;
		this.capacidadMax = capacidadMax;
		this.empleadosMin = empleadosMin;
		this.ubicacion = ubicacion;
		this.nivelEsclusividad = nivelEsclusividad;
		this.empleadosAsignados = empleadosAsignados;
		this.esDeTemporada = esDeTemporada;
		this.fechaInicioTemporada = fechaInicioTemporada;
		this.fechaFinTemporada = fechaFinTemporada;
		CondicionClimatica = condicionClimatica;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public int getEmpleadosMin() {
		return empleadosMin;
	}

	public void setEmpleadosMin(int empleadosMin) {
		this.empleadosMin = empleadosMin;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getNivelEsclusividad() {
		return nivelEsclusividad;
	}

	public void setNivelEsclusividad(String nivelEsclusividad) {
		this.nivelEsclusividad = nivelEsclusividad;
	}


	public List<Empleado> getEmpleadosAsignados() {
		return empleadosAsignados;
	}

	public void setEmpleadosAsignados(List<Empleado> empleadosAsignados) {
		this.empleadosAsignados = empleadosAsignados;
	}

	public boolean isEsDeTemporada() {
		return esDeTemporada;
	}

	public void setEsDeTemporada(boolean esDeTemporada) {
		this.esDeTemporada = esDeTemporada;
	}

	public LocalDate getFechaInicioTemporada() {
		return fechaInicioTemporada;
	}

	public void setFechaInicioTemporada(LocalDate fechaInicioTemporada) {
		this.fechaInicioTemporada = fechaInicioTemporada;
	}

	public LocalDate getFechaFinTemporada() {
		return fechaFinTemporada;
	}

	public void setFechaFinTemporada(LocalDate fechaFinTemporada) {
		this.fechaFinTemporada = fechaFinTemporada;
	}

	public String getCondicionClimatica() {
		return CondicionClimatica;
	}

	public void setCondicionClimatica(String condicionClimatica) {
		CondicionClimatica = condicionClimatica;
	}
    
	public boolean tienePersonalSuficiente() {
        return this.empleadosAsignados.size() >= this.empleadosMin;
    }


    /**
     * Verifica si la atracción está operativa en una fecha y condiciones climáticas dadas.
     */
    public boolean estaOperativa(LocalDate fecha, String climaActual) {
        //  Verifica temporada
        if (esDeTemporada) {
        	if (fecha.isBefore(fechaInicioTemporada) || fecha.isAfter(fechaFinTemporada)) {
                return false; 
            }
        }
        //  Verifica clima
        if (CondicionClimatica == climaActual ) {
            return false; 
        }
        //  Verifica personal (si tiene suficientes empleados asignados para hoy)
        
        if (!tienePersonalSuficiente()) {
             // System.out.println("Atracción " + nombre + " no operativa por falta de personal.");
            return false;
        }

        return true; 
    
    }
	
    

}
