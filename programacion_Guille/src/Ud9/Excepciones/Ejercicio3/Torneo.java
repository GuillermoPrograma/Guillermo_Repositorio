package Ud9.Excepciones.Ejercicio3;

public class Torneo {

	private String nombre;
	private Nivel nivel;
	 int contador = 0;
	Jugadores jugadoresInscritos[] = new Jugadores[10];
	
	public void AgregarJugadores(Jugadores j) 
	{
	
	 if(contador < 10) 
	 {
		 jugadoresInscritos[contador] = j;
		 contador++;
	 }
	}
	public void RegistrarResultados() 
	{
		
		
	}
}
