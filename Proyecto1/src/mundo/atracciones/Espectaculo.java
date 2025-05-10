package atracciones;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import usuario.Empleado;

public class Espectaculo {
	
	protected String nombre;
	protected String descripcion;
	protected List<LocalDateTime> horarios; // Representa los horarios específicos del espectáculo.
	protected String ubicacionGeneral; // Aunque no es fija, puede tener una ubicación general o posibles ubicaciones.
	protected boolean esDeTemporada;
	protected  LocalDate fechaInicioTemporada; 
    protected  LocalDate fechaFinTemporada;   
    protected String CondicionClimatica;
    protected  int empleadosMin;
    protected List<Empleado> empleadosAsignados;
    
    
	public Espectaculo(String nombre, String descripcion, List<LocalDateTime> horarios, String ubicacionGeneral,
			boolean esDeTemporada, LocalDate fechaInicioTemporada, LocalDate fechaFinTemporada,
			String condicionClimatica, int empleadosMin, List<Empleado> empleadosAsignados) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.horarios = horarios;
		this.ubicacionGeneral = ubicacionGeneral;
		this.esDeTemporada = esDeTemporada;
		this.fechaInicioTemporada = fechaInicioTemporada;
		this.fechaFinTemporada = fechaFinTemporada;
		CondicionClimatica = condicionClimatica;
		this.empleadosMin = empleadosMin;
		this.empleadosAsignados = empleadosAsignados;
	}
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<LocalDateTime> getHorarios() {
		return horarios;
	}
	public void setHorarios(List<LocalDateTime> horarios) {
		this.horarios = horarios;
	}
	public String getUbicacionGeneral() {
		return ubicacionGeneral;
	}
	public void setUbicacionGeneral(String ubicacionGeneral) {
		this.ubicacionGeneral = ubicacionGeneral;
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
	public int getEmpleadosMin() {
		return empleadosMin;
	}
	public void setEmpleadosMin(int empleadosMin) {
		this.empleadosMin = empleadosMin;
	}
	public List<Empleado> getEmpleadosAsignados() {
		return empleadosAsignados;
	}
	public void setEmpleadosAsignados(List<Empleado> empleadosAsignados) {
		this.empleadosAsignados = empleadosAsignados;
	}
	
	public boolean tienePersonalSuficiente() {
        return this.empleadosAsignados.size() >= this.empleadosMin;
    }

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
