package Ud10.colecciones.TerceraTanta;

import java.util.Scanner;

public class TestLista {
public static void main(String[] args) {
	ListaCantantesFamosos lista = new ListaCantantesFamosos();
	Scanner entrada = new Scanner(System.in);
	lista.lista.add(entrada.next());
	lista.lista.add(entrada.next());
	
	System.out.println(lista.lista);
} 
}
