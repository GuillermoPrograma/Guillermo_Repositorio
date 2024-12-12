package Ud4.ejercicios;

import java.util.Scanner;

public class Ejercicio_15_Numero_Meses {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Dime el Numero del mes");
		int NumeroMes = entrada.nextInt();
		
		switch (NumeroMes) 
		{
		case (1): 
			System.out.println(" Enero 31");
		break;
		case(2):
			System.out.println(" Febrero 29");
		break;
		case(3):
			System.out.println(" Marzo 31");
		
		break;
		case(4):
			System.out.println(" Abril 30");
		break;
		case(5):
			System.out.println(" Mayo 31");
		break;
		case(6):
			System.out.println(" Junio 30");
		break;
		case(7):
			System.out.println(" Julio 31");
		break;
		case(8):
			System.out.println(" Agosto31");
		break;
		case(9):
			System.out.println(" Septiembre 30");
		break;
		case(10):
			System.out.println(" Octubre 31");
		break;
		case(11):
			System.out.println(" Noviembre 30");
		break;
		case(12):
			System.out.println(" Diciembre 31");
		break;
		default: 
			System.out.println("No es ningun mes");
			break;
		
		
		
		}
		
		
	}

}
