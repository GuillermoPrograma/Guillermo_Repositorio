package Ud4.ejercicios.bucles2;

public class Ejercicio4_SumaCuadrados {

	public static void main(String[] args) {
		
		int numeroelegido = 1;
		int sumaNumero = 0;
		for(int i = 1;i <= 5; i++) {
			
			sumaNumero += numeroelegido * numeroelegido;
			System.out.println("Numero actual " + numeroelegido + " suma " + sumaNumero);
			numeroelegido ++;
		}
	}
	
}
