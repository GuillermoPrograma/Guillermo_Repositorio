package Ejercicio_hotel;

public class Persona {

	private String Dni;
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;

	public Persona(String Dni, String nombre, String apellidos, String fechaNacimiento) {
		this.Dni = Dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;

	}

	public String getDni() {
		return Dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [Dni=" + Dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

}
