package usuario;

public abstract class Usuario{
	private String userName;
	private String password;
	private String nombre;
	public Usuario(String userName, String password, String nombre) {
		this.userName = userName;
		this.password = password;
		this.nombre = nombre;
	}
	public String getUserName() {
		return userName;
	}
	public String getNombre() {
		return nombre;
	}
	public boolean autenticar(String passwordIngresada) {
		return this.password.equals(passwordIngresada);
	}
	
}