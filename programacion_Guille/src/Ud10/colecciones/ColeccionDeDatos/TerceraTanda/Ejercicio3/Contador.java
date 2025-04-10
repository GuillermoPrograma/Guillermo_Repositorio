package Ud10.colecciones.ColeccionDeDatos.TerceraTanda.Ejercicio3;

public class Contador {
	private String nombre;
	private int num;

	
	Contador(String nombre, int contador)
	{
		this.nombre = nombre;
		this.num = contador;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Contador [nombre=" + nombre + ", num=" + num + "]";
	}

}
