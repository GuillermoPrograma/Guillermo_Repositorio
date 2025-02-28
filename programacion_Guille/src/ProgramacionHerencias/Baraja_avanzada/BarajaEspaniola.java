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
		Carta Monton[] = new Carta[numCartasTotal];
		int contador = 0;
		if (cuarenta == true) {
			
			for (int i = 0; i <= 3; i++) {
				for (int j = 0; j <= 9; j++) {
					if (i == 0) {
						if (j > 6) {
							dadaBarajaEsp[contador] = new Carta(j + 3, PalosBarEspaniola.Bastos);
							contador ++;
						} else {
							dadaBarajaEsp[contador] = new Carta(j + 1, PalosBarEspaniola.Bastos);
						contador ++;}
					}
					if (i == 1) {
						if (j > 6) {
							dadaBarajaEsp[contador] = new Carta(j + 3, PalosBarEspaniola.Copas);
							contador++;
						} else {
							dadaBarajaEsp[contador] = new Carta(j + 1, PalosBarEspaniola.Copas);
						contador++;}
					}
					if (i == 2) {
						if (j > 6) {
							dadaBarajaEsp[contador] = new Carta(j + 3, PalosBarEspaniola.Espadas);
							contador++;
						} else {
							dadaBarajaEsp[contador] = new Carta(j + 1, PalosBarEspaniola.Espadas);
						contador++;}
					}
					if (i == 3) {
						if (j > 6) {
							dadaBarajaEsp[contador] = new Carta(j + 3, PalosBarEspaniola.Oros);
							contador++;
						} else {
							dadaBarajaEsp[contador] = new Carta(j + 1, PalosBarEspaniola.Oros);
						contador++;}
					}

				}
			}
		} else { 
			for (int i = 0; i <= 3; i++) {
				for (int j = 0; j <= 12; j++) {
					if (i == 0) {
						dadaBarajaEsp[contador] = new Carta(j + 1, PalosBarEspaniola.Bastos);
						contador++;
					}
					if (i == 1) {

						dadaBarajaEsp[contador] = new Carta(j + 1, PalosBarEspaniola.Copas);
						contador++;
					}
					if (i == 2) {

						dadaBarajaEsp[contador] = new Carta(j + 1, PalosBarEspaniola.Espadas);
						contador++;
					}
					if (i == 3) {
						dadaBarajaEsp[contador] = new Carta(j + 1, PalosBarEspaniola.Oros);
						contador++;
					}
				}
			}
		}
		this.setMonton(Monton);
		this.setDadas(dadaBarajaEsp);

	}
}
