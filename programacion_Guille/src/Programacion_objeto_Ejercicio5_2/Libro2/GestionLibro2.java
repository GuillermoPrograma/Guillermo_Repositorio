package Programacion_objeto_Ejercicio5_2.Libro2;

public class GestionLibro2 {
public static void main(String[] args) {
	
Libro2 l1 = new Libro2("Tokyoblues","murakama",180);
Libro2 l2 = new Libro2("100aniosdeSoledad","GarciaMarquez");
Libro2 l3 = new Libro2();
	l3.setLibro("ElnombreDelViento");
	
	System.out.println(l1.esCorto());
	
	System.out.println(l2.esIgual(l1));
	
}
}
