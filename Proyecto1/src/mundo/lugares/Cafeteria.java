package lugares;

import java.util.List;

import usuario.Empleado;

public class Cafeteria extends LugarServicio {
	
	private int minCocineros;

	public Cafeteria(String nombre, String ubicacion, int minCajeros, List<Empleado> empleadosAsignados,
			int minCocineros) {
		super(nombre, ubicacion, minCajeros, empleadosAsignados);
		this.minCocineros = minCocineros;
	}

	public int getMinCocineros() {
		return minCocineros;
	}
	public void setMinCocineros(int minCocineros) {
		this.minCocineros = minCocineros;
	}
	
	public boolean tienePersonalSuficiente() {
        boolean suficientesCajeros = super.tienePersonalSuficiente(); 
        if (!suficientesCajeros) return false;

        long countCocineros = getEmpleadosAsignados().stream()
                                  .filter(e -> e != null && e.getRol()=="Cocinero" ) 
                                  .count();
        return countCocineros >= this.minCocineros;
    }

}




