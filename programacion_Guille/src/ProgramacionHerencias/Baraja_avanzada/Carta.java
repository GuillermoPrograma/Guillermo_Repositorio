package ProgramacionHerencias.Baraja_avanzada;

public class Carta {

	private int num;
	private PalosBarEspaniola paloEspaniol;
	private static int numCarta = 0;
	private PalosBarFrancesa paloFrances;
	public Carta(int num, PalosBarEspaniola espaniol) 
	{
		this.num = num;
		this.paloEspaniol = espaniol;
		this.paloFrances = PalosBarFrancesa.nulo;
		numCarta++;
	}
	
	public Carta(int num, PalosBarFrancesa frances) 
	{
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

	@Override
	public String toString() {
		if(this.paloFrances == PalosBarFrancesa.nulo)
		return "Carta [num=" + num + ", palo=" + paloEspaniol + "]";
		else
			return "Carta [num=" + num + ", palo=" + paloFrances + "]";
	}
	
	
	
}
