package Ud10.colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		ArrayList<Integer> lista = new ArrayList<>();

		int valor;
		while ((valor=entrada.nextInt()) != -1) {
			if(valor > 0)
			lista.add(valor);
		} 
		if (valor == -1) {

			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i) % 2 == 0) {
					System.out.println(lista.get(i));
				}
				if (lista.get(i) % 3 == 0) {
					lista.remove(i);
				}

			}
			System.out.println(lista);
		}

	}
}
