package ProgramacionHerencias.Baraja_avanzada;

public class BarajaEspaniola extends Baraja {

	private static boolean cuarenta;
	private static int numCartasTotal = queBaraja();

	public BarajaEspaniola(boolean cuarenta) {
		super(BarajaEspaniola.queBaraja());

		BarajaEspaniola.cuarenta = cuarenta;
		crearBaraja();
	}

	private static int queBaraja() {
		if (cuarenta == true)
			numCartasTotal = 40;
		else
			numCartasTotal = 48;

		return numCartasTotal;

	}

	public void crearBaraja() {
		Carta dadaBarajaEsp[] = new Carta[numCartasTotal];
		if (cuarenta == true) {

			for (int i = 0; i <= 3; i++) {
				for (int j = 0; j <= 9; j++) {
					if (i == 0) {
						if (j > 6) {
							dadaBarajaEsp[Carta.getNumCarta()] = new Carta(j + 3, PalosBarEspaniola.Bastos);
						} else
							dadaBarajaEsp[Carta.getNumCarta()] = new Carta(j + 1, PalosBarEspaniola.Bastos);
					}
					if (i == 1) {
						if (j > 6) {
							dadaBarajaEsp[Carta.getNumCarta()] = new Carta(j + 3, PalosBarEspaniola.Copas);
						} else
							dadaBarajaEsp[Carta.getNumCarta()] = new Carta(j + 1, PalosBarEspaniola.Copas);
					}
					if (i == 2) {
						if (j > 6) {
							dadaBarajaEsp[Carta.getNumCarta()] = new Carta(j + 3, PalosBarEspaniola.Espadas);
						} else
							dadaBarajaEsp[Carta.getNumCarta()] = new Carta(j + 1, PalosBarEspaniola.Espadas);
					}
					if (i == 3) {
						if (j > 6) {
							dadaBarajaEsp[Carta.getNumCarta()] = new Carta(j + 3, PalosBarEspaniola.Oros);
						} else
							dadaBarajaEsp[Carta.getNumCarta()] = new Carta(j + 1, PalosBarEspaniola.Oros);
					}

				}
			}
		} else {
			for (int i = 0; i <= 3; i++) {
				for (int j = 0; j <= 12; j++) {
					if (i == 0) {
						dadaBarajaEsp[Carta.getNumCarta()] = new Carta(j + 1, PalosBarEspaniola.Bastos);
					}
					if (i == 1) {

						dadaBarajaEsp[Carta.getNumCarta()] = new Carta(j + 1, PalosBarEspaniola.Copas);
					}
					if (i == 2) {

						dadaBarajaEsp[Carta.getNumCarta()] = new Carta(j + 1, PalosBarEspaniola.Espadas);
					}
					if (i == 3) {
						dadaBarajaEsp[Carta.getNumCarta()] = new Carta(j + 1, PalosBarEspaniola.Oros);
					}
				}
			}
		}

		this.setDadas(dadaBarajaEsp);

	}
}
