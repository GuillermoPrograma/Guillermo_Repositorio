package Ud5.ejercicios5_2;

public class Baraja {

	private int numCartaActual = 0;
	private Carta dadas[] = new Carta[40];
	private int descartadas;
	private Carta monton[] = new Carta[40];
	private int contadorMonton = 0;

	public Baraja() {

		crearBaraja();
	}

	private void crearBaraja() {

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 9; j++) {
				if (i == 0) {
					if (j > 6) {
						dadas[Carta.getNumCarta()] = new Carta(j + 3, Palos.Bastos);
					} else
						dadas[Carta.getNumCarta()] = new Carta(j + 1, Palos.Bastos);
				}
				if (i == 1) {
					if (j > 6) {
						dadas[Carta.getNumCarta()] = new Carta(j + 3, Palos.Copas);
					} else
						dadas[Carta.getNumCarta()] = new Carta(j + 1, Palos.Copas);
				}
				if (i == 2) {
					if (j > 6) {
						dadas[Carta.getNumCarta()] = new Carta(j + 3, Palos.Espadas);
					} else
						dadas[Carta.getNumCarta()] = new Carta(j + 1, Palos.Espadas);
				}
				if (i == 3) {
					if (j > 6) {
						dadas[Carta.getNumCarta()] = new Carta(j + 3, Palos.Oros);
					} else
						dadas[Carta.getNumCarta()] = new Carta(j + 1, Palos.Oros);
				}

			}

		}

	}

	public void barajar() {
		int aleatorio;

		Carta baraja2[] = new Carta[40];
		for (int i = 0; i < dadas.length; i++) {

			aleatorio = (int) (Math.random() * (39 + 1));
			while (baraja2[aleatorio] != null)
				aleatorio = (int) (Math.random() * (39 + 1));

			baraja2[aleatorio] = dadas[i];

		} // ss
		this.dadas = baraja2;
		numCartaActual = 0;
	}

	public void siguiente_carta() {
		if (numCartaActual < 40) {
			
			System.out.println(dadas[numCartaActual].toString());
			monton[contadorMonton] = dadas[numCartaActual];
			dadas[numCartaActual] = null;
			descartadas ++;
			numCartaActual ++;
			contadorMonton++;
		} else
			System.out.println("No quedan cartas disponibles");
	}

	public int cartasDisponibles() {
		int disponibles = 0;

		for (int i = 0; i < dadas.length; i++) {
			if (dadas[i] != null)
				disponibles += 1;
			
		}
		return disponibles;

	}

	public Carta[] darCartas(int num) {
		Carta[] devueltas = new Carta[num];
		int disponibles = cartasDisponibles();
		int contador = 0;
		if (disponibles >= num) {
			int numCartaArray = numCartaActual;
			for (int i = numCartaActual; i <  numCartaArray + num ; i++) {
				if (dadas[i] != null) {
					devueltas[contador] =dadas[i];
					monton[contadorMonton] =dadas[i];
					dadas[i] = null;
					contador++;
					numCartaActual ++;
					descartadas ++;
					contadorMonton++;}
				
				else
					num++;
			}
			return devueltas;

		} else {
			System.out.println("No hay suficientes cartas para darte");
		return null;}
	}

	public void mostrarMonton() {
		for (int i = 0; i < monton.length; i++) {
			
			if(monton[i] != null)
				System.out.println(monton[i].toString());
		}

	}

	public void mostrarBaraja() {

		for (int i = 0; i < dadas.length; i++) {
			if (dadas[i] != null)
				System.out.println(dadas[i]);

		}

	}
}
