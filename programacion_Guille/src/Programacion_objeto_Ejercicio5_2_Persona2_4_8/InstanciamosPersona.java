package Programacion_objeto_Ejercicio5_2_Persona2_4_8;

public class InstanciamosPersona {
	static Persona p1 = new Persona("05731755V", "Guillermo", "Garcia_Hualde" ,23 );
	static Persona p2 = new Persona ("0987655B" , "Ayoub" , "Ben_Jaddi", 19);
	
	public static void main(String[] args) {
		
		
		
		
		p2.setDni("0984444E");
		System.out.println("Nuevo Dni de : " +p2.getNombre() + " Es " + p2.getDni());
	}
	public static boolean mayorEdad(int edad) 
	{
		boolean mayorEdad = false;
		if(edad/18 > 0) 
		{
			mayorEdad = true;
		}
		
		return mayorEdad;
	}
	public void imprime() 
	{
		System.out.println("Persona 1 : " + p1.getNombre() + " " +p1.getDni() + " " + p1.getApellidos() + " es mayor de edad :" +mayorEdad(p1.getEdad()));
		System.out.println("Persona 2 : " + p2.getNombre() + " " +p2.getDni() + " " + p2.getApellidos() + " es mayor de edad :" +mayorEdad(p2.getEdad()));
	}
	public static boolean Jubilado(int edad) 
	{
		boolean jubilado = false;
		if(edad > 65) 
		{
			jubilado = true;
		}
		
		return jubilado;
	}
	public int diferenciaEdad(Persona p) 
	{
		this.p1 - p
		
	}
}
