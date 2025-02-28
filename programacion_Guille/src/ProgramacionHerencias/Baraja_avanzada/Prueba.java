package ProgramacionHerencias.Baraja_avanzada;

public class Prueba {

	 public static void main(String[] args) {
		Baraja baraja1 = new BarajaEspaniola(true);
		Baraja baraja2 = new BarajaFrancesa();
		
		  //baraja1.mostrarBaraja();
		  baraja1.siguiente_carta();
		 baraja1.darCartas(5);
	
		
		baraja2.darCartas(10);
	
	
	}
}
