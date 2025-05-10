package atracciones;

import java.time.LocalDate;
import java.util.List;

import usuario.Empleado;

public class AtraccionCultural extends Atraccion {
	
	protected int edadMin;

	public AtraccionCultural(String tipo, int capacidadMax, int empleadosMin, String ubicacion,
			String nivelEsclusividad, List<Empleado> empleadosAsignados, boolean esDeTemporada,
			LocalDate fechaInicioTemporada, LocalDate fechaFinTemporada, String condicionClimatica, int edadMin) {
		super(tipo, capacidadMax, empleadosMin, ubicacion, nivelEsclusividad, empleadosAsignados, esDeTemporada,
				fechaInicioTemporada, fechaFinTemporada, condicionClimatica);
		this.edadMin = edadMin;
	}

	public int getEdadMin() {
		return edadMin;
	}
	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}
	
	 public void asignarEmpleado(Empleado empleado) {
	        if (empleado != null && !this.empleadosAsignados.contains(empleado)) {
	           this.empleadosAsignados.add(empleado);
	       }
	   }

	   
	   public void desasignarEmpleado(Empleado empleado) {
	        if (empleado != null) {
	           this.empleadosAsignados.remove(empleado);
	       }
	   }
	    

}
