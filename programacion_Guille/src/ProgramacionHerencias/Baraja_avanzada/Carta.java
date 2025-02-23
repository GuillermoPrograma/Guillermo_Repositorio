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
		numCarta++;
	}
	
	public Carta(int num, PalosBarFrancesa frances) 
	{
		this.num = num;
		this.paloFrances = frances;
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

	@Override
	public String toString() {
		return "Carta [num=" + num + ", palo=" + paloEspaniol + "]";
	}
	
	
	
}
