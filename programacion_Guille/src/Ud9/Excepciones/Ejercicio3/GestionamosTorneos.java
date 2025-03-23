package Ud9.Excepciones.Ejercicio3;

public class GestionamosTorneos {
	public static void main(String[] args) throws EdadInvalidaException, TorneoIvalidoException, PuntosInvalidosException {
	
		Jugadores jugador1 = new Jugadores( 20,  600, Nivel.profesional);
		Jugadores jugador2 = new Jugadores(15, 200, Nivel.juvenil);
		Jugadores jugadorNulo = new Jugadores (11, 200, Nivel.juvenil);
		Jugadores jugadorNulo2 = new Jugadores(20, 100, Nivel.profesional);


		Torneo torneoPro = new Torneo("Profesional",Nivel.profesional);
		Torneo torneoJuv = new Torneo("Juvenil", Nivel.juvenil);

		torneoPro.AgregarJugadores(jugador1);
		//torneoPro.AgregarJugadores(jugadorNulo); 
		torneoJuv.AgregarJugadores(jugador2);
		torneoJuv.RegistrarResultados(jugador2, 200);
		//torneoJuv.AgregarJugadores(jugadorNulo2);
		System.out.println(jugador2.getPuntos());
	}
 
}
