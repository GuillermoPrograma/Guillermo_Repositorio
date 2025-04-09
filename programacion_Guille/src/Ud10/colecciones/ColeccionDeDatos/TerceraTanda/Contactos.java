package Ud10.colecciones.ColeccionDeDatos.TerceraTanda;

public class Contactos {

	private String nombre;
	private String telefono;
	
	public Contactos(String nombre, String telefono) {
		this.nombre=nombre;
		this.telefono=telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Contactos [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
	
	
}
