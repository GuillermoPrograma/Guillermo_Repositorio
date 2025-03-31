package Ud10.colecciones.SegundaTanda;

import java.util.ArrayList;
import java.util.List;

public class listaCompra {

	public static void main(String[] args) {
		List <String>lista = new ArrayList<>();
		List <String>lista2 = new ArrayList<>();
		
		lista.add("Caramelos");
		lista.add("Pollo");
		lista.add("Jamon");
		
		lista2.add("Caramelos");
		lista2.add("Pollo");
		lista2.add("Jamon");
		
		
		System.out.println("Las listas son iguales : " + lista.equals(lista2));
		System.out.println(lista.indexOf("Pollo"));
		System.out.println(lista2.indexOf("Jamon"));
	}
	
}
