package Ud9.Excepciones.Ejercicio3;

public class Juvenil extends Jugadores {

	public Juvenil(int edad, int puntos) {
		super(edad, puntos, Nivel.juvenil);

	}

	public void inscribirseEnTorneo(Torneo torneo)
			throws EdadInvalidaException, TorneoIvalidoException, PuntosInvalidosException {
		torneo.agregarJugadores(this);

	}

}
