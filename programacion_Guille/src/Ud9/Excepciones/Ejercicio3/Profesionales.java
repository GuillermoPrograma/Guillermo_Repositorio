package Ud9.Excepciones.Ejercicio3;

public class Profesionales extends Jugadores {

	public Profesionales(int edad, int puntos) {
		super(edad, puntos, Nivel.profesional);
		// No pongo problemas para la edad porque no me pone en ningun lado
		// que haya un limite para ser profesional, solo para inscribirse
	}

	public void inscribirseEnTorneo(Torneo torneo)
			throws EdadInvalidaException, TorneoIvalidoException, PuntosInvalidosException {
		torneo.agregarJugadores(this, this.getPuntos());

	}

}
