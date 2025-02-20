package Ud5.ejercicios5_2;

public class Baraja {

	private Carta baraja[] = new Carta[40];

	public Baraja(Carta[] baraja) {
		this.baraja = baraja;
	}

	public void barajar() {
		int aleatorio;
		int contador = 0;
		Carta baraja2[] = new Carta[40];
		for (int i = 0; i < baraja.length; i++) {
			
			aleatorio = (int) (Math.random() * (40 + 1));
			while (baraja2[aleatorio] != null)
				aleatorio = (int) (Math.random() * (40 + 1));
			if (baraja2[aleatorio] == null) {
				
				baraja[0] = baraja2[aleatorio];
			}
		

		}

	}

}
