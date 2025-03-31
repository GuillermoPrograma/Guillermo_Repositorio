package Ud10.colecciones.SegundaTanda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class listaTareas {
	static List<String> lista = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		lista.add("Hacer colada");
		lista.add("Comprar comida");
		agregarTarea(entrada.next());
		insertarPosicion(entrada.nextInt(), entrada.next());
		System.out.println(lista);
		ordenarAlfabeticamente();
		System.out.println(lista);
		ordenContrario();
		System.out.println(lista);
		eliminar("Comprar comida");
		System.out.println(lista);
	}
	public static void agregarTarea(String texto) 
	{
		lista.add(texto);
	}
	public static void insertarPosicion(int pos,String texto) 
	{
		lista.add(pos,texto);
	}
	public static void ordenarAlfabeticamente() 
	{
		lista.sort(null);
	}
	public static void ordenContrario() 
	{
		lista.sort(Comparator.reverseOrder());
	}
	public static void eliminar(String texto) 
	{
		lista.remove(texto);
	}
}
