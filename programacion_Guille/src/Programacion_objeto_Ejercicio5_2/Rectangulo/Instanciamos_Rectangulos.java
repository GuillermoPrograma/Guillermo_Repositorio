package Programacion_objeto_Ejercicio5_2.Rectangulo;

import java.util.Scanner;

public class Instanciamos_Rectangulos {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	Rectangulo r1 = new Rectangulo(0,6,1,2);
	Rectangulo r2 = new Rectangulo(2,4,0,9);
	System.out.println("Coordenadas : "+ r1.getX1() + "," + r1.getX2()+ "," +  r1.getY1()+ "," + r1.getY2());
	System.out.println("Coordenadas : "+ r2.getX1() + "," + r2.getX2()+ "," +  r2.getY1()+ "," + r2.getY2());
	
	System.out.println("Perimetro de r1 :" + 2 * (r1.base() + r1.altura()));
	System.out.println("Perimetro de r2 :" + 2 * (r2.base() + r2.altura()));;
	
	System.out.println("Área de r1 :" +  ((r1.base() * r1.altura())));
	System.out.println("Área de r2 :" + ((r2.base() * r2.altura())));
	
	System.out.println("Cambiamos el x1 del r1 :");
	r1.setX1(entrada.nextInt()); 
	System.out.println("Cambiamos el x2 del r2 :");
	r2.setX2(entrada.nextInt());
	System.out.println("Perimetro de r1 :" + 2 * (r1.base() + r1.altura()));
	System.out.println("Perimetro de r2 :" + 2 * (r2.base() + r2.altura()));;
	
	System.out.println("Área de r1 :" +  ((r1.base() * r1.altura())));
	System.out.println("Área de r2 :" + (r2.base() + r2.altura()));;
	
	r1.imprimir();
}

}
