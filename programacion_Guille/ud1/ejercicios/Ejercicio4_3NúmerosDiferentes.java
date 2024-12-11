package ud1.ejercicios;

import java.util.Scanner;

public class Ejercicio4_3NúmerosDiferentes {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero1 = entrada.nextInt();

		int numero2 = entrada.nextInt();

		int numero3 = entrada.nextInt();
		int i = 0;

		for (i = 0; i < 2000; i++) {

			if (numero1 == numero2 || numero1 == numero3) {
				System.out.println("Cambiar numero 1");

				numero1 = entrada.nextInt();
			} else if (numero2 == numero3)

			{
				System.out.println("Cambiar numero 2");

				numero2 = entrada.nextInt();

			}

			else {

				entrada.close();
				if (numero1 > numero2 && numero2 > numero3) {

					System.out.println("Numero 1 es el mayor");
					break;
				}
				if (numero2 > numero1 && numero2 > numero3) {
				
					System.out.println("Numero 2 es el mayor");
					break;
					

				}
				if (numero3 > numero1) {

					if (numero3 > numero2) {

						System.out.println("Numero 3 es el mayor");
						break;
					}

				}

			}

		}
	}
}
