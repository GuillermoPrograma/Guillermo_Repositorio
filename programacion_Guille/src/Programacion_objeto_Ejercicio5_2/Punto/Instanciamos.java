package Programacion_objeto_Ejercicio5_2.Punto;

public class Instanciamos {

	public static void main(String[] args) {
		
		
		
		Punto p1;
		Punto p2;
		Punto p3;
		
		p1 = new Punto(5,0);
		p2 = new Punto(10,10);
		p3 = new Punto(-3,7);
		
		System.out.println("X de p3: " + p3.getX());
		System.out.println("Y de P2 antes : " + p2.getY());
		p2.setY(3);
		System.out.println("Y de p2 después : " + p2.getY());
	}
	
}
