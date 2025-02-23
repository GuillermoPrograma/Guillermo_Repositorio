package Ud5.ejercicios5_2;

public class Carta {

	private int num;
	private PalosBarEspaniola palo;
	private static int numCarta = 0;
	
	public Carta(int num, PalosBarEspaniola palo) 
	{
		this.num = num;
		this.palo = palo;
		numCarta++;
	}

	public int getNum() {
		return num;
	}

	public PalosBarEspaniola getPalo() {
		return palo;
	}

	public static int getNumCarta() {
		return numCarta;
	}

	@Override
	public String toString() {
		return "Carta [num=" + num + ", palo=" + palo + "]";
	}
	
	
	
}
