package Ud9.Excepciones.Ejercicio3;

public class GestionamosTorneos {
	public static void main(String[] args) {

		Profesionales jugador1 = new Profesionales(20, 600);
		Juvenil jugador2 = new Juvenil(15, 200);
		Juvenil jugadorNulo = new Juvenil(11, 200);
		Profesionales jugadorNulo2 = new Profesionales(20, 100);

		Torneo torneoPro = new Torneo("Profesional", Nivel.profesional);
		Torneo torneoJuv = new Torneo("Juvenil", Nivel.juvenil);

		try {
			jugador1.inscribirseEnTorneo(torneoPro);
			jugador2.inscribirseEnTorneo(torneoJuv);
			// jugadorNulo2.inscribirseEnTorneo(torneoPro);
			// jugadorNulo.inscribirseEnTorneo(torneoJuv);
		} catch (EdadInvalidaException | TorneoIvalidoException | PuntosInvalidosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		jugador2.competir(torneoJuv, 200);

		System.out.println(jugador2.getPuntos());
		System.out.println(jugador1.getPuntos());
	}

}
