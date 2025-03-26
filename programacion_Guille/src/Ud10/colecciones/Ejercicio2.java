package Ud10.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {
	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<>();
		for (int i = 0; i <= 4; i++)
			lista.add((int) (1 + Math.random() * (10 - 1 + 1)));

		while (lista.contains(5)) {
			lista.remove(Integer.valueOf(5));
		}
		System.out.println(lista);
	}

}
