package Programacion_objeto_Ejercicio5_2.Persona;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona(String _dni, String _nombre, String _apellidos, int _edad) 
	{
		this.dni = _dni;
		this.nombre = _nombre;
		this.apellidos = _apellidos;
		this.edad = _edad;
	}
	
	//metodos 
	
	public  boolean mayorEdad() {
		boolean mayorEdad = false;
		if (this.edad / 18 > 0) {
			mayorEdad = true;
		}

		return mayorEdad;
	}

	public void imprime() {
		System.out.println("La persona tiene "+this.edad+" anios "+ " con dni "+ this.dni+" llamado "+this.nombre +" con apellidos "+ this.apellidos);
	}

	public boolean Jubilado() {
		boolean jubilado = false;
		if (this.edad > 65) {
			jubilado = true;
		}

		return jubilado;
	}

		public int diferenciaEdad(Persona p) {
			int diferenciaEdad;
			diferenciaEdad = Math.abs(this.edad - p.getEdad());
			return diferenciaEdad;
		}

	
	//getters y setters 
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
