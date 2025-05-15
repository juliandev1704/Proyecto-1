package usuarios.test;

import java.time.LocalTime;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import usuario.Admin;
import usuario.Empleado;
import atracciones.Turno;

public class AdminTest{
	private Admin admin;
	private Empleado empleado;
	private Turno turno;
	@BeforeEach
	void setUp() {
		admin = new Admin("Administrador","12345","admin@prueba");
		ArrayList<String> calificaciones = new ArrayList<String>(); 
		empleado = new Empleado("Empleado","12345","empleado@prueba","Cocina");
		LocalTime inicio = LocalTime.parse("07:00:00");
		LocalTime fin = LocalTime.parse("12:00:00");
		turno = new Turno(inicio, fin);		
	}
	@Test
	void agregarTurnoTest() {
		admin.asignarTurnoAEmpleado(empleado,turno);
	}
	
}