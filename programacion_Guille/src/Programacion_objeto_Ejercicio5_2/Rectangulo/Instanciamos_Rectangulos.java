package Programacion_objeto_Ejercicio5_2.Rectangulo;

import java.util.Scanner;

public class Instanciamos_Rectangulos {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	Rectangulo r1 = new Rectangulo(0,6,1,2);
	Rectangulo r2 = new Rectangulo(2,4,0,9);
	System.out.println("Coordenadas : "+ r1.getX1() + "," + r1.getX2()+ "," +  r1.getY1()+ "," + r1.getY2());
	System.out.println("Coordenadas : "+ r2.getX1() + "," + r2.getX2()+ "," +  r2.getY1()+ "," + r2.getY2());
	
	r1.Perimetro(r1);
	r2.Perimetro(r2);
	
	
	
	
	System.out.println("Cambiamos el x1 del r1 :");
	r1.setX1(entrada.nextInt()); 
	System.out.println("Cambiamos el x2 del r2 :");
	r2.setX2(entrada.nextInt());
	
	r1.area(r1);
	r2.area(r2);
	
	
	
	r1.imprimir();
	r2.desplaza(8, 5);
	
}

}
