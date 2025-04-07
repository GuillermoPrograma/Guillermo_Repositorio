package Ud10.colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		List<Integer> lista = new ArrayList<>();
		
		List<Integer> lista2 = new ArrayList<>();
		int num = 1;
		while(num != 0) 
		{
			num = entrada.nextInt();
			if(num > 0) 
			{
				lista.add(num);
			}
			if(num < 0)  
			{
				lista2.add(num);
			}
			
		}
		
		int listaResultado = 0;
		int listaResultado2 = 0;
		for(int i = 0; i < lista.size(); i++) 
		{
			listaResultado += lista.get(i);
			
		}
		for(int i = 0; i < lista2.size(); i++) 
		{
			listaResultado2 += lista2.get(i);
			
		}
		System.out.println(lista);
		System.out.println("Resultado Suma:" + listaResultado );
		 System.out.println(lista2);
		 System.out.println("Resultado Suma:" + listaResultado2 );
	}
}
