package Ud4.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio14_CajeroAutomatico {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int billete5 = 0, billete10 = 0, billete20 = 0, billete50 = 0, billete100 = 0, billete500 = 0;
		int dineroDado = entrada.nextInt();
		boolean bucle = true;

		while (bucle == true) {

			if (dineroDado % 5 != 0) {
				System.out.println("Tiene que ser multiplo de 5");
				dineroDado = entrada.nextInt();
			}

			if (dineroDado / 500 <= 0) {
				if (dineroDado / 100 <= 0) {
					if (dineroDado / 50 <= 0) {
						if (dineroDado / 20 <= 0) {
							if (dineroDado / 10 <= 0) {
								if (dineroDado / 5 >= 0) {
									dineroDado = dineroDado - 5;
									billete5++;

								}
							} else {
								dineroDado = dineroDado - 10;
								billete10++;

							}
						} else {
							dineroDado = dineroDado - 20;
							billete20++;
						}

					} else {
						dineroDado = dineroDado - 50;
						billete50++;

					}

				} else {
					dineroDado = dineroDado - 100;
					billete100++;

				}
			} else {
				dineroDado = dineroDado - 500;
				billete500++;

			}
			if (dineroDado == 0) {

				bucle = false;
				entrada.close();
			}
		}
		System.out.println(" Billetes de 5: " + billete5);
		System.out.println(" Billetes de 10: " + billete10);
		System.out.println(" Billetes de 20: " + billete20);
		System.out.println(" Billetes de 50: " + billete50);
		System.out.println(" Billete de 100: " + billete100);
		System.out.println(" Billete de 500 " + billete500);
	}
}
