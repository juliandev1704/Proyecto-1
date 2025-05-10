package lugares;

import java.util.List;

import usuario.Empleado;

public class Taquilla extends LugarServicio {

	public Taquilla(String nombre, String ubicacion, int minCajeros, List<Empleado> empleadosAsignados) {
		super(nombre, ubicacion, minCajeros, empleadosAsignados);
	}
	
	

}