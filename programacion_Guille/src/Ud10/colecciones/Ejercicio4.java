package Ud10.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		
			List<Integer> lista = new ArrayList<>();
			 
			for (int i = 0; i <= 10; i++)
				lista.add((int) (1 + Math.random() * (10 - 1 + 1)));
			
			List<Integer> lista2 = new ArrayList<>();
			Iterator<Integer> it = lista.iterator();
			
			Integer num;
			while(it.hasNext()) {
				num = it.next();
				if(!lista2.contains(num)) 
					lista2.add(num);
				
			}
			
			Iterator<Integer> it2 = lista2.iterator();
			Integer num2;
			while(it2.hasNext()) {
				num2 = it2.next();
				if(num2==5) {
				it2.remove();
				}
			}
			
			System.out.println(lista);
			System.out.println("--------------------");
			System.out.println(lista2);
			
		
		
	}
}
