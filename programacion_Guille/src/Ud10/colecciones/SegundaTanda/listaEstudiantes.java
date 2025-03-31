package Ud10.colecciones.SegundaTanda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listaEstudiantes {
	static List<String> listaEstudiantes = new ArrayList<>();

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String texto;
		do 
		{
			System.out.println("Introduce nombre a la lista");
			texto = entrada.next();
			listaEstudiantes.add(texto);
		}
		while(!texto.equals("No"));
		agregarEstudiantes(entrada.next());
		insertarPosicion(2, entrada.next());
		System.out.println(listaEstudiantes);
		ordenar();
		mostrarListaActualizada();
		
	}

	public static void agregarEstudiantes(String nom) {

		listaEstudiantes.add(nom);

	}

	public static void insertarPosicion(int pos, String nom) {
		listaEstudiantes.add(pos, nom);
	}

	public static void ordenar() {
		listaEstudiantes.sort(null);
	}

	public static void mostrarListaActualizada() {
	System.out.println(listaEstudiantes);
	}
}
