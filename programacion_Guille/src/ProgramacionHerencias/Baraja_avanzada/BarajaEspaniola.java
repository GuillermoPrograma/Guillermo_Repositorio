package ProgramacionHerencias.Baraja_avanzada;

public class BarajaEspaniola extends Baraja {

	private Carta dadas[] = new Carta[40];
	private boolean cuarenta;

	public BarajaEspaniola(boolean cuarenta) {
		this.cuarenta = cuarenta;

	}

	private void crearBaraja() {
		if (cuarenta == true) {
			for (int i = 0; i <= 3; i++) {
				for (int j = 0; j <= 9; j++) {
					if (i == 0) {
						if (j > 6) {
							dadas[Carta.getNumCarta()] = new Carta(j + 3, PalosBarEspaniola.Bastos);
						} else
							dadas[Carta.getNumCarta()] = new Carta(j + 1, PalosBarEspaniola.Bastos);
					}
					if (i == 1) {
						if (j > 6) {
							dadas[Carta.getNumCarta()] = new Carta(j + 3, PalosBarEspaniola.Copas);
						} else
							dadas[Carta.getNumCarta()] = new Carta(j + 1, PalosBarEspaniola.Copas);
					}
					if (i == 2) {
						if (j > 6) {
							dadas[Carta.getNumCarta()] = new Carta(j + 3, PalosBarEspaniola.Espadas);
						} else
							dadas[Carta.getNumCarta()] = new Carta(j + 1, PalosBarEspaniola.Espadas);
					}
					if (i == 3) {
						if (j > 6) {
							dadas[Carta.getNumCarta()] = new Carta(j + 3, PalosBarEspaniola.Oros);
						} else
							dadas[Carta.getNumCarta()] = new Carta(j + 1, PalosBarEspaniola.Oros);
					}

				}
			}
		}

	}
}
