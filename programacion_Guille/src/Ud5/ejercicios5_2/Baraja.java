package Ud5.ejercicios5_2;

public class Baraja {

	
	private int numCartaActual = 0;
	private Carta dadas[] = new Carta[40];
	private int descartadas;

	public Baraja() {

		crearBaraja();
	}

	private void crearBaraja() {

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 9; j++) {
				if (i == 0) {
					if (j > 6) {
						dadas[j] = new Carta(j + 3, Palos.Bastos);
					} else
						dadas[j] = new Carta(j + 1, Palos.Bastos);
				}
				if (i == 1) {
					if (j > 6) {
						dadas[j] = new Carta(j + 3, Palos.Copas);
					} else
						dadas[j] = new Carta(j + 1, Palos.Copas);
				}
				if (i == 2) {
					if (j > 6) {
						dadas[j] = new Carta(j + 3, Palos.Espadas);
					} else
						dadas[j] = new Carta(j + 1, Palos.Espadas);
				}
				if (i == 3) {
					if (j > 6) {
						dadas[j] = new Carta(j + 3, Palos.Sotas);
					} else
						dadas[j] = new Carta(j + 1, Palos.Sotas);
				}
				
			}

		}

	}

	public void barajar() {
		int aleatorio;

		Carta baraja2[] = new Carta[40];
		for (int i = 0; i < dadas.length; i++) {

			aleatorio = (int) (Math.random() * (40 + 1));
			while (baraja2[aleatorio] != null)
				aleatorio = (int) (Math.random() * (40 + 1));

			dadas[i] = baraja2[aleatorio];
		}
		this.dadas = baraja2;
		numCartaActual = 0;
	}

	public void siguiente_carta() {
		if (numCartaActual <= 40) {
			System.out.println(dadas[numCartaActual].toString());
			dadas[numCartaActual] = null;
			descartadas = +1;
			numCartaActual = +1;
		} else
			System.out.println("No quedan cartas disponibles");
	}

	public void cartasDisponibles() {
		int disponibles = 0;
		
		for(int i = 0; i < dadas.length; i++) 
		{
			if(dadas[i] != null)
			disponibles += 1;
		}
		
		System.out.println("Quedan disponibles : " + (disponibles) + " Cartas.");
	}

	public void MostrarBaraja() {

		for (int i = numCartaActual; i < dadas.length; i++) {
			if(dadas[i] != null)
			System.out.println(dadas[i]);

		}

	}
}
