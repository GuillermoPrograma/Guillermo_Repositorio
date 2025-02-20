package Ud5.ejercicios5_2;

public class Baraja {

	private Carta baraja[] = new Carta[40];
	private int numCartaActual = 0;
	private Carta dadas[] = new Carta[40];
	private int descartadas;

	public Baraja(Carta[] baraja) {
		this.baraja = baraja;
	}

	public void crearBaraja() 
	{
		
		
	}
	
	public void barajar() {
		int aleatorio;

		Carta baraja2[] = new Carta[40];
		for (int i = 0; i < baraja.length; i++) {

			aleatorio = (int) (Math.random() * (40 + 1));
			while (baraja2[aleatorio] != null)
				aleatorio = (int) (Math.random() * (40 + 1));

			baraja[i] = baraja2[aleatorio];
		}
		this.baraja = baraja2;
		numCartaActual = 0;
	}

	public void siguiente_carta() {
		if (numCartaActual <= 40) {
			System.out.println(baraja[numCartaActual].toString());
			baraja[numCartaActual] = null;
			descartadas =+ 1;
			numCartaActual = +1;
		} else
			System.out.println("No quedan cartas disponibles");
	}

	public void cartasDisponibles() {
		int disponibles;
		boolean contado = false;
		while (contado =true)
		{
			for(int i = 0; i)
		}
		System.out.println("Quedan disponibles : " + (baraja.length - numCartaActual) + " Cartas.");
	}

	public void MostrarBaraja() {

		for (int i = numCartaActual; i < baraja.length; i++) {

			System.out.println(baraja[i]);

		}

	}
}
