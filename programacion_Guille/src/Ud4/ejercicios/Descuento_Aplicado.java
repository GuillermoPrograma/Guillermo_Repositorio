package Ud4.ejercicios;

import java.util.Scanner;

public class Descuento_Aplicado {
	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);

		double PrecioNormal;
		double PrecioDescuento;
		double Resultado;

		System.out.println("Precio Normal");
		PrecioNormal = entrada.nextDouble();
		System.out.println("Precio Descontado");
		PrecioDescuento = entrada.nextDouble();

		Resultado = (PrecioDescuento / PrecioNormal) * 100;

		System.out.println("La rebaja es del " + Resultado + "%");

	}

}
