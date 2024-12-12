package Ud5.Ejercicio3;

import java.util.Scanner;

public class Ejercicio1_Años_Meses_dias {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el año que quieres calcular");
		int año = entrada.nextInt();
		boolean esbisiesto = añoBisiesto(año);
		if (esbisiesto == true) {
			System.out.println("Es año bisiesto");
		} else {
			System.out.println("No es año bisiesto");

		}
		System.out.println("Dime el mes!!");
		int mes = entrada.nextInt();
		System.out.println(diasMes(mes,esbisiesto));
	}

	public static boolean añoBisiesto(int año) {
		boolean esbisiesto = false;
		if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
			esbisiesto = true;

		}

		return esbisiesto;
	}
	
	

	public static int diasMes(int mes, boolean bisiesto) {
		int dias = 0;
		switch (mes) {
		case (1):
			dias = 31;
			break;
		case (2):
			if (bisiesto == true) {
				dias = 29;
			} else {
				dias = 28;
			}
			break;
		case (3):
			dias = 31;
		case (4):
			dias = 30;
		case (5):
			dias = 31;
		case (6):
			dias = 30;
		case (7):
			dias = 31;
		case (8):
			dias = 31;
		case (9):
			dias = 30;
		case (10):
			dias = 31;
		case (11):
			dias = 30;
		case (12):
			dias = 31;
		default:
			System.out.println("Mes erroneo");
			break;
		}
		return dias;
	
	}

}
