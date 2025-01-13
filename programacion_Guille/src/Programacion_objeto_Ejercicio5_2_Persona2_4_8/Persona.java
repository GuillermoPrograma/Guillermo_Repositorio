package Programacion_objeto_Ejercicio5_2_Persona2_4_8;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona(String _dni, String _nombre, String _apellidos, int _edad) 
	{
		dni = _dni;
		nombre = _nombre;
		apellidos = _apellidos;
		edad = _edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
