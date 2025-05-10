package usuario;
import atracciones.Turno;

public class Admin extends Usuario {

    public Admin(String userName, String password, String correo) {
        super(userName, password, correo);
    }

    public void crearNuevaAtraccion(/*..., ParqueDiversiones parque*/) {
        System.out.println("Admin " + super.getUserName() + " está creando una atracción...");
    }

    public void asignarTurnoAEmpleado(Empleado empleado, Turno turno /*, ParqueDiversiones parque*/) {
        System.out.println("Admin " + super.getUserName() + " asignando turno a " + super.getUserName());
        empleado.agregarTurno(turno);
    }

     public void modificarInformacionEmpleado(Empleado empleado /*, ... nuevos datos ...*/) {
         System.out.println("Admin " + empleado.getUserName() + " modificando datos de " + empleado.getUserName());
    }

    public String toString() {
        return "Admin [User: " + super.getUserName() + ", Correo: " + super.getUserName() + "]";
    }
}