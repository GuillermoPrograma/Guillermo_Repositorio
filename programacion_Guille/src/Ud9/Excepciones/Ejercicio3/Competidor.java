package Ud9.Excepciones.Ejercicio3;

public interface Competidor {
	void inscribirseEnTorneo(Torneo torneo) throws EdadInvalidaException, TorneoIvalidoException;
	void competir(Torneo torneo, int resultado);
	
}
