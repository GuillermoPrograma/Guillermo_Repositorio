package Ud5.RuletaRusa;

public class Juego {

	private Jugador jugadores[];
	private int numJugadores;
	private Revolver r;
	Juego(int numJugadores) {

		if (numJugadores > 1 && numJugadores < 6)
			this.numJugadores = numJugadores;
		else
			this.numJugadores = 6;
		jugadores = new Jugador[numJugadores];
		for (int i = 0; i < numJugadores; i++) {

			jugadores[i] = new Jugador();
		}

	}

	public boolean FinJuego() {
		boolean fin = false;
		for (int i = 0; i < numJugadores; i++) {
			if (jugadores[i].isVivo() == false) {
				System.out.println("Se acaba el juego");
				fin = true;
			}

		}
		return fin;
	}

//	public void ronda() {
//		while(contador < 3) 
//		{
//			if (jugadores[i].isVivo() == true)
//				System.out.println("El jugador esta vivo");
//			else
//				System.out.println("El jugador ha muerto");
//			
//		}

			
//}
	
}
