package usuario;
import usuario.Usuario;
import tiquetes.tiquete;
import java.util.ArrayList;
import tiquetes.tiquete;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {

    private List<Tiquete> tiquetes;

    public Cliente(String userName, String password, String correo) {
        super(userName, password, correo);
        this.tiquetes = new ArrayList<>();
    }

    public List<Tiquete> getTiquetes() {
        return new ArrayList<>(tiquetes);
    }

    public void agregarTiquete(Tiquete nuevoTiquete) {
        if (nuevoTiquete != null) {
            this.tiquetes.add(nuevoTiquete);
        }
    }

    public void comprarTiquete(Tiquete tiquete) {
        System.out.println("Cliente " + getUserName() + " comprando tiquete: " + tiquete);
        agregarTiquete(tiquete);
    }

    @Override
    public String toString() {
         return "Cliente [User: " + getUserName() + ", Correo: " + getCorreo() + ", Tiquetes: " + tiquetes.size() + "]";
    }
}