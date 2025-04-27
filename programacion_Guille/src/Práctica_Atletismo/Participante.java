package Práctica_Atletismo;

public interface Participante {

	void inscribirseEnCarrera(Carrera carrera) throws CarreraNoPerdimitidaException;
	void competir (Carrera carrera , Medalla medallaresultado) throws CorredorNoCorreAquiException;
	
	
}
