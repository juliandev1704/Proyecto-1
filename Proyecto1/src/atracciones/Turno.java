package atracciones;

import java.time.Duration;
import java.time.LocalTime;

public class Turno {
	
	protected final LocalTime horaInicio;   
    protected final LocalTime horaFin;
    
    
	public Turno(LocalTime horaInicio, LocalTime horaFin) {
		super();
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		
		if (!horaFin.isAfter(horaInicio)) {
            throw new IllegalArgumentException("La hora de fin (" + horaFin + ") debe ser posterior a la hora de inicio (" + horaInicio + ")");
        }
	}


	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	public LocalTime getHoraFin() {
		return horaFin;
	}
	
	public Duration getDuracion() {
        return Duration.between(horaInicio, horaFin);
    }
	
	
   
}
