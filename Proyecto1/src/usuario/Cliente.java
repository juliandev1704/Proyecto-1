package usuario;
import usuario.Usuario;
import tiquetes.tiquete;
import java.util.ArrayList;
import tiquetes.tiquete;

public class Cliente extends Usuario{
	private ArrayList<tiquete> tiquetes;
	public Cliente(String userName, String password, String nombre) {
		super(userName, password, nombre);
		tiquetes = new ArrayList<tiquete>();
	}
	public void addTiquete(tiquete ticket) {
		tiquetes.add(ticket);
	}
	public ArrayList<tiquete> getTiquetes(){
		return tiquetes;
	}
}