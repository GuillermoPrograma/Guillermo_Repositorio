package Programacion_objeto_Ejercicio5_2_Persona2_4_8;

public class InstanciamosPersona {

	public static void main(String[] args) {

		Persona p1 = new Persona("05731755V", "Guillermo", "Garcia_Hualde", 23);
		Persona p2 = new Persona("0987655B", "Ayoub", "Ben_Jaddi", 19);

		int edad;

		p2.setDni("0984444E");
		
		p1.imprime();
		
		boolean mayorEdad = p1.mayorEdad();
		
		System.out.println("Es mayorEdad " + mayorEdad);
		System.out.println(p2.Jubilado());
		
		System.out.println("la diferencia de edad es " + p1.diferenciaEdad(p2));
	}

	
}
