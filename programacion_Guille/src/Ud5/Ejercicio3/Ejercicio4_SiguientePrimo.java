package Ud5.Ejercicio3;

import java.util.Scanner;

public class Ejercicio4_SiguientePrimo {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		buscaElPrimo(numero);

	}

	public static boolean primo(int numero) {
		boolean esPrimo = false;
		int divisor = 0;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				divisor++;
			}

		}
		if(divisor == 0) 
		{
			esPrimo = true;
		}
		return esPrimo;

	}

	public static void buscaElPrimo(int numero) {
		boolean primo = false;
		int contador = numero;
		while (primo == false) {

			primo = primo(contador);
if(primo == false)
			contador++;
		}

		System.out.println("El siguiente numero primo : " + contador);

	}
}
