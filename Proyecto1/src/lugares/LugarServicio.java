package lugares;

import java.util.List;
import usuario.Empleado;



public abstract class LugarServicio implements LugarTrabajo {
	
	protected String nombre;
	protected  String ubicacion;
	protected  int minCajeros; 
	protected  List<Empleado> empleadosAsignados;
	
	
	public LugarServicio(String nombre, String ubicacion, int minCajeros, List<Empleado> empleadosAsignados) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.minCajeros = minCajeros;
		this.empleadosAsignados = empleadosAsignados;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getMinCajeros() {
		return minCajeros;
	}
	public void setMinCajeros(int minCajeros) {
		this.minCajeros = minCajeros;
	}
	public List<Empleado> getEmpleadosAsignados() {
		return empleadosAsignados;
	}
	public void setEmpleadosAsignados(List<Empleado> empleadosAsignados) {
		this.empleadosAsignados = empleadosAsignados;
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


   public boolean tienePersonalSuficiente() {
       long countCajeros = this.empleadosAsignados.stream()
                               .filter(e -> e != null && e.puedeSerCajero()) // Asumiendo que Empleado tiene un método así
                               .count();
       return countCajeros >= this.minCajeros;
   }

	

}
