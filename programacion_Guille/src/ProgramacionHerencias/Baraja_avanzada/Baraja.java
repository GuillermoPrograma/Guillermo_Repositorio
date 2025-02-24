package ProgramacionHerencias.Baraja_avanzada;

public abstract class Baraja {

	private int numCartaActual = 0;

	private int descartadas;

	private int contadorMonton = 0;
	private int numCartasTotal;
	private int numCartasPalo;

	public Baraja(int numCartasTotal) {
		this.numCartasTotal = numCartasTotal;
	}
	
	public abstract void crearBaraja();

	private Carta monton[] = new Carta[numCartasTotal];
	private Carta dadas[] = new Carta[numCartasTotal];

	public void barajar() {
		int aleatorio;

		Carta baraja2[] = new Carta[numCartasTotal];
		for (int i = 0; i < dadas.length; i++) {

			aleatorio = (int) (Math.random() * ((numCartasTotal - 1) + 1));
			while (baraja2[aleatorio] != null)
				aleatorio = (int) (Math.random() * ((numCartasTotal - 1) + 1));

			baraja2[aleatorio] = dadas[i];

		} // ss
		this.dadas = baraja2;
		numCartaActual = 0;
	}

	public void siguiente_carta() {
		if (numCartaActual < numCartasTotal) {

			System.out.println(dadas[numCartaActual].toString());
			monton[contadorMonton] = dadas[numCartaActual];
			dadas[numCartaActual] = null;
			descartadas++;
			numCartaActual++;
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
			for (int i = numCartaActual; i < numCartaArray + num; i++) {
				if (dadas[i] != null) {
					devueltas[contador] = dadas[i];
					monton[contadorMonton] = dadas[i];
					dadas[i] = null;
					contador++;
					numCartaActual++;
					descartadas++;
					contadorMonton++;
				}

				else
					num++;
			}
			return devueltas;

		} else {
			System.out.println("No hay suficientes cartas para darte");
			return null;
		}
	}

	public void mostrarMonton() {
		for (int i = 0; i < monton.length; i++) {

			if (monton[i] != null)
				System.out.println(monton[i].toString());
		}

	}

	public void mostrarBaraja() {

		for (int i = 0; i < dadas.length; i++) {
			if (dadas[i] != null)
				System.out.println(dadas[i]);

		}

	}

	public int getNumCartaActual() {
		return numCartaActual;
	}

	public void setNumCartaActual(int numCartaActual) {
		this.numCartaActual = numCartaActual;
	}

	public int getDescartadas() {
		return descartadas;
	}

	public void setDescartadas(int descartadas) {
		this.descartadas = descartadas;
	}

	public int getContadorMonton() {
		return contadorMonton;
	}

	public void setContadorMonton(int contadorMonton) {
		this.contadorMonton = contadorMonton;
	}

	public int getNumCartasTotal() {
		return numCartasTotal;
	}

	public void setNumCartasTotal(int numCartasTotal) {
		this.numCartasTotal = numCartasTotal;
	}

	public int getNumCartasPalo() {
		return numCartasPalo;
	}

	public void setNumCartasPalo(int numCartasPalo) {
		this.numCartasPalo = numCartasPalo;
	}

	public Carta[] getMonton() {
		return monton;
	}

	public void setMonton(Carta[] monton) {
		this.monton = monton;
	}

	public Carta[] getDadas() {
		return dadas;
	}

	public void setDadas(Carta[] dadas) {
		this.dadas = dadas;
	}

}
