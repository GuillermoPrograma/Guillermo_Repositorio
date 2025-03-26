package Ud10.colecciones;

import java.util.ArrayList;

public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		
		for (int i = 0; i <= 10; i++)
			lista.add((int) (1 + Math.random() * (10 - 1 + 1)));
		
		ArrayList<Integer> lista2 = new ArrayList<>();
		
		
		for(int i = 0; i < lista.size(); i++) 
		{
			
		if(!lista2.contains(lista.get(i)))
			lista2.add(lista.get(i));
		
			
		}
		
		System.out.println(lista);
		System.out.println("--------------------");
		System.out.println(lista2);
		}
	
		
		
		
		
	}
	
	
	
	
	
	
	
	

