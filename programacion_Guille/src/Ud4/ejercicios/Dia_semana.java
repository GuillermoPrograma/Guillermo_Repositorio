package Ud4.ejercicios;

import java.util.Scanner;

public class Dia_semana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int dia;
		System.out.println("Dime un número de la semana");
		dia = entrada.nextInt();

		switch (dia) {
		case 1: {
			System.out.println("Lunes");
			entrada.close();
			break;

		}
		case 2: {
			System.out.println("Martes");
			
			entrada.close();
			break;

		}
		case 3: {
			System.out.println("Miercoles");
			entrada.close();
			break;

		}
		case 4: {
			System.out.println("Jueves");
			entrada.close();
			break;

		}
		case 5: {
			System.out.println("Viernes");
			entrada.close();
			break;

		}
		case 6: {
			System.out.println("Sabado");
			entrada.close();
			break;

		}
		case 7: {
			System.out.println("Domingo");
			entrada.close();
			break;

		}
		default: {
			System.out.println("No coincide ningún día");
			entrada.close();
		}
		}
	}

}
