package lugares;

import java.util.List;

import usuario.Empleado;

public class Tienda extends LugarServicio {

	public Tienda(String nombre, String ubicacion, int minCajeros, List<Empleado> empleadosAsignados) {
		super(nombre, ubicacion, minCajeros, empleadosAsignados);
	}
	
	

}
