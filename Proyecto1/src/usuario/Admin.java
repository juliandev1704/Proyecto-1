import atracciones.Turno;
import usuario.Empleado;

public class Admin extends UsuarioSistema {

    public Admin(String userName, String password, String correo) {
        super(userName, password, correo);
    }

    public void crearNuevaAtraccion(/*..., ParqueDiversiones parque*/) {
        System.out.println("Admin " + empleado.getUserName() + " está creando una atracción...");
    }

    public void asignarTurnoAEmpleado(Empleado empleado, Turno turno /*, ParqueDiversiones parque*/) {
        System.out.println("Admin " + empleado.getUserName() + " asignando turno a " + empleado.getUserName());
        empleado.agregarTurno(turno);
    }

     public void modificarInformacionEmpleado(Empleado empleado /*, ... nuevos datos ...*/) {
         System.out.println("Admin " + empleado.getUserName() + " modificando datos de " + empleado.getUserName());
    }

    public String toString() {
        return "Admin [User: " + empleado.getUserName() + ", Correo: " + empleado.getCorreo() + "]";
    }
}