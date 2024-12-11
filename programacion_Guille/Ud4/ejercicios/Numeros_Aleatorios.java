package Ud4.ejercicios;

import java.util.Scanner;

public class Numeros_Aleatorios {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int primerNumero = 0;
		int segundoNumero = 0;
		int numeroAleatorio;
		int rango = 0;
		primerNumero = PrimerNumero();
		segundoNumero = SegundoNumero();
		

		
		for (int i = 1; i <= 10; i++) {
			
			if(segundoNumero > primerNumero && segundoNumero - primerNumero >= 10) 
			{
				rango = segundoNumero - primerNumero;
				numeroAleatorio = (int) ((Math.random() * rango) + primerNumero);
				System.out.println("el numero " + i + " es :" + numeroAleatorio);
				
			}
			else if (primerNumero > segundoNumero  && primerNumero - segundoNumero >= 10) 
			{
				rango = primerNumero - segundoNumero;
				numeroAleatorio = (int) ((Math.random() * rango) + segundoNumero);
				System.out.println("el numero " + i + " es :" + numeroAleatorio);
				
			}
			else 
			{
				System.out.println("Tiene que haber una diferencia de 10 numeros");
				  primerNumero=PrimerNumero(); segundoNumero=SegundoNumero();
				i=0;
			}
				
			

		}
		entrada.close();

	}

	public static int PrimerNumero() { // Dentro de las comillas son los parametros de entrada, esto es diferente a c#
		Scanner entrada = new Scanner(System.in);
		int primerNumero;
		System.out.println("Dame el primer número");
		primerNumero = entrada.nextInt();
		return primerNumero;
	}

	public static int SegundoNumero() {
		Scanner entrada = new Scanner(System.in);
		int segundoNumero;
		System.out.println("Dame el segundo número");

		segundoNumero = entrada.nextInt();
		return segundoNumero;

	}

}
