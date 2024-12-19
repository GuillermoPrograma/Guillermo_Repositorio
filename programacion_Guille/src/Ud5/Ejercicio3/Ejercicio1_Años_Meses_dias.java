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
		System.out.println(diasMes(mes,año));
	}

	public static boolean añoBisiesto(int año) {
		boolean esbisiesto = false;
		if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
			esbisiesto = true;

		}

		return esbisiesto;
	}
	
	

	public static int diasMes(int mes, int anio) {
		int dias = 0;
		switch (mes) {
		case (1):
			dias = 31;
			break;
		case (2):
			if (añoBisiesto(anio)) {
				dias = 29;
			} else {
				dias = 28;
			}
			break;
		case (3):
			dias = 31;
		break;
		case (4):
			dias = 30;
		break;
		case (5):
			dias = 31;
		break;
		case (6):
			dias = 30;
		break;
		case (7):
			dias = 31;
		break;
		case (8):
			dias = 31;
		break;
		case (9):
			dias = 30;
		break;
		case (10):
			dias = 31;
		break;
		case (11):
			dias = 30;
		break;
		case (12):
			dias = 31;
		break;
		default:
			System.out.println("Mes erroneo");
			break;
		}
		return dias;
	
	}

}
