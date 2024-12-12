package Ud4.ejercicios.bucles;

public class Ejercicio13_FizzBuzz {
		public static void main(String[] args) {
		
			
			for(int i=1;i<=100;i++){
				
				
				
				if(i % 3 == 0){
					if (i % 5 == 0) 
					{
						System.out.println("Numero " + "fizzBuzz");
						
					}
					else 
					{
						System.out.println("Numero " + "fizz");
						
					}
					
					
				}
				if(i % 5 == 0) {
					
					System.out.println("Numero " + "buzz");
					
				}
				else 
				{
					System.out.println("Numero " + i);
					
				}
				
			}
			
			
		}
}
