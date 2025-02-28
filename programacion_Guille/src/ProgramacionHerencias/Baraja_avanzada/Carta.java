package ProgramacionHerencias.Baraja_avanzada;

public class Carta {

	private int num;
	private PalosBarEspaniola paloEspaniol;
	private static int numCarta = 0;
	private PalosBarFrancesa paloFrances;

	public Carta(int num, PalosBarEspaniola espaniol) {
		this.num = num;
		this.paloEspaniol = espaniol;
		this.paloFrances = PalosBarFrancesa.nulo;
		numCarta++;
	}

	public Carta(int num, PalosBarFrancesa frances) {
		this.num = num;
		this.paloFrances = frances;
		this.paloEspaniol = PalosBarEspaniola.nulo;
		numCarta++;
	}

	public int getNum() {
		return num;
	}

	public PalosBarEspaniola getPalo() {
		return paloEspaniol;
	}

	public static int getNumCarta() {
		return numCarta;
	}

	public PalosBarEspaniola getPaloEspaniol() {
		return paloEspaniol;
	}

	public void setPaloEspaniol(PalosBarEspaniola paloEspaniol) {
		this.paloEspaniol = paloEspaniol;
	}

	public PalosBarFrancesa getPaloFrances() {
		return paloFrances;
	}

	public void setPaloFrances(PalosBarFrancesa paloFrances) {
		this.paloFrances = paloFrances;
	}

	public String AsignacionCartas(int num) {
		String valor = null;
		if (this.paloEspaniol == PalosBarEspaniola.nulo) {
			switch (num) {

			case (1):
				valor = "AS";
				break;
			case (10):
				valor = "Sota";
				break;
			case (12):
				valor = "Caballo";
			break;
			case (13):
				valor = "Rey";
			break;

			}

		} else if (this.paloFrances == PalosBarFrancesa.nulo) {

			switch (num) {

			case (1):
				valor = "AS";
				break;
			case (11):
				valor = "Jota";
				break;
			case (12):
				valor = "Reina";
			case (13):
				valor = "Rey";

			}

		}

		return valor;

	}

	@Override
	public String toString() {
		if (this.paloFrances == PalosBarFrancesa.nulo)
			if (num == 1  || num == 11 || num == 12 || num == 13)
				return "Carta [num=" + AsignacionCartas(num) + ", palo=" + paloEspaniol + "]";
			else
				return "Carta [num=" + num + ", palo=" + paloEspaniol + "]";

		else if (num == 1 || num == 10||  num == 12 || num == 13)
			return "Carta [num=" + AsignacionCartas(num) + ", palo=" + paloFrances + "]";
		else
			return "Carta [num=" + num + ", palo=" + paloFrances + "]";
	}

}
