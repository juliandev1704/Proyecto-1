package lugares;

import java.util.List;

import usuario.Empleado;

public interface LugarTrabajo {


	    void asignarEmpleado(Empleado empleado);

	    void desasignarEmpleado(Empleado empleado);

	    List<Empleado> getEmpleadosAsignados();

	    boolean tienePersonalSuficiente();

}


