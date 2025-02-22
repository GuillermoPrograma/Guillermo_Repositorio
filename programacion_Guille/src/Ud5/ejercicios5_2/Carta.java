package Ud5.ejercicios5_2;

public class Carta {

	private int num;
	private Palos palo;
	private static int numCarta = 0;
	
	public Carta(int num, Palos palo) 
	{
		this.num = num;
		this.palo = palo;
		numCarta++;
	}

	public int getNum() {
		return num;
	}

	public Palos getPalo() {
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
