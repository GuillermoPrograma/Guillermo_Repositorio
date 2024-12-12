package Ud4.ejercicios;

import java.util.Scanner;

public class Compañia_Cobro {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// Esto son las variables
		double impuestoDomingo = 0.03;
		double impuesto8Mins = 0.8;
		double impuesto10Mins = 0.7;
		double impuesto10Plus = 0.5;
		double precio;
		double impuestoMañana = 0.15;
		double impuestoTarde = 0.10;
		System.out.println("Minutos");
		int minutos = entrada.nextInt();

		System.out.println("Es Domingo ?");
		boolean domingo = entrada.nextBoolean();

		System.out.println("Es por la mañana?");
		boolean mañana = entrada.nextBoolean();

		if (domingo == true) {
			if (minutos <= 5) {
				precio = 1;

				precio += (precio * impuestoDomingo);
				System.out.println("La llamada ha costado un " + precio + "euros");

			}
			if (minutos <= 8 && minutos < 5) {
				precio = 1;

				minutos = minutos - 5;

				precio += ((minutos + precio) * impuestoDomingo * impuesto8Mins);

				System.out.println("La llamada ha costado un " + precio + "euros");

			}
			if (minutos <= 10 && minutos > 8 ) {
				precio = (1);

				minutos = minutos - 5;

				precio += ((minutos + precio) * impuestoDomingo * impuesto8Mins);

				minutos = minutos - 3;
				precio += (minutos + precio) * impuesto10Mins;
				System.out.println("La llamada ha costado un " + precio + "euros");}

				if (minutos > 10) {

					precio = (1);

					minutos = minutos - 5;

					precio += ((minutos + precio) * impuestoDomingo * impuesto8Mins);

					minutos = minutos - 3;
					precio += (minutos + precio) * impuesto10Mins;

					minutos = minutos - 2;
					precio += (minutos + precio) * impuesto10Plus;
					System.out.println("La llamada ha costado un " + precio + "euros");

				}

			

		}

		else if (domingo == false && mañana == true) {
			if (minutos <= 5) {
				precio = 1;
				precio = (precio * impuestoMañana);
				System.out.println("La llamada ha costado un " + precio + "euros");
			}  if (minutos <= 8 && minutos > 5) {
				precio = (1);

				minutos = minutos - 5;

				precio += ((minutos + precio) * impuestoMañana * impuesto8Mins);
				System.out.println("La llamada ha costado un " + precio + "euros");

				}
			if (minutos <= 10 && minutos > 8) {
				precio = (1);

				minutos = minutos - 5;

				precio += ((minutos + precio) * impuestoMañana * impuesto8Mins);

				minutos = minutos - 3;
				precio += (minutos + precio) * impuesto10Mins;
				System.out.println("La llamada ha costado un " + precio + "euros");

				}
			if (minutos > 10) {

				precio = (1);

				minutos = minutos - 5;

				precio += ((minutos + precio) * impuestoMañana * impuesto8Mins);

				minutos = minutos - 3;
				precio += (minutos + precio) * impuesto10Mins;

				minutos = minutos - 2;
				precio += (minutos + precio) * impuesto10Plus;
				System.out.println("La llamada ha costado un " + precio + "euros");

			}

		} else if (domingo == false && mañana == false) {
			
			if (minutos <= 5) {
				precio = 1;
				precio = (precio * impuestoTarde);
				System.out.println("La llamada ha costado un " + precio + "euros");
			}if (minutos <= 8 && minutos < 5) {
				precio = (1);

				minutos = minutos - 5;

				precio += ((minutos + precio) * impuestoTarde * impuesto8Mins);
				System.out.println("La llamada ha costado un " + precio + "euros");

				}

		if (minutos <= 10) {
			precio = (1);

			minutos = minutos - 5;

			precio += ((minutos + precio) * impuestoTarde * impuesto8Mins);

			minutos = minutos - 3;
			precio += (minutos + precio) * impuesto10Mins;
			System.out.println("La llamada ha costado un " + precio + "euros");

			

		}
		if (minutos > 10) {

			precio = (1);

			minutos = minutos - 5;

			precio += ((minutos + precio) * impuestoTarde * impuesto8Mins);

			minutos = minutos - 3;
			precio += (minutos + precio) * impuesto10Mins;

			minutos = minutos - 2;
			precio += (minutos + precio) * impuesto10Plus;
			System.out.println("La llamada ha costado un " + precio + "euros");
		}
		}

	}

}
