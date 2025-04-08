package usuario;
import usuario.Usuario;
import atraccion.Atraccion;
import java.util.ArrayList;
import java.util.List;

public class Empleado extends Usuario{
	private List<String> roles;
	private List<String> capacitaciones;
	private String id;
	public Empleado(String userName, String password, String nombre, String year, String month) {
		super(userName, password, nombre);
		this.roles = new ArrayList<>();
		this.capacitaciones = new ArrayList<>();
		id = year + month + super.userHash(userName);
	}
	public void addRol(String newRol) {
		roles.add(newRol);
	}
	public void addCapacitacion(String newCapacitacion) {
		capacitaciones.add(newCapacitacion);
	}
	public List<String> getRoles(){
		return roles;
	}
	public List<String> getCapacitaciones(){
		return capacitaciones;
	}
	public String getUserId() {
		return id;
	}
	public boolean accesoAtraccion(Atraccion atraccion) {
		String capacitacionPrevia = atraccion.getCapacitacionPrevia();
		return capacitaciones.contains(capacitacionPrevia);
	}
	
}
