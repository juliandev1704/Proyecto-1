package usuario;
import java.util.ArrayList;
import java.util.List;

import atracciones.Turno;

public class Empleado extends Usuario {

    private ArrayList<String> capacitaciones;
    private String rol;
    private List<Turno> turnos;

    public Empleado(String userName, String password, String correo, String rol) {
        super(userName, password, correo);
        this.rol = rol;
        this.turnos = new ArrayList<>();
    }

    public ArrayList<String> getCapacitaciones() {
        return capacitaciones;
    }

    public void addCapacitaciones(String capacitacion) {
        capacitaciones.add(capacitacion);
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