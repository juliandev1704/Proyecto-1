package usuario;
import java.util.ArrayList;
import java.util.List;

import atracciones.Turno;

public class Empleado extends Usuario {

    private String calificaciones;
    private String rol;
    private List<Turno> turnos;

    public Empleado(String userName, String password, String correo, String calificaciones, String rol) {
        super(userName, password, correo);
        this.calificaciones = calificaciones;
        this.rol = rol;
        this.turnos = new ArrayList<>();
    }

    public String getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(String calificaciones) {
        this.calificaciones = calificaciones;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<Turno> getTurnos() {
        return new ArrayList<>(turnos);
    }

    public void agregarTurno(Turno nuevoTurno) {
        if (nuevoTurno != null) {
            this.turnos.add(nuevoTurno);
        }
    }

    public boolean eliminarTurno(Turno turnoAEliminar) {
       return this.turnos.remove(turnoAEliminar);
    }

    @Override
    public String toString() {
        return "Empleado [User: " + getUserName() + ", Rol: " + rol ;
    }
}