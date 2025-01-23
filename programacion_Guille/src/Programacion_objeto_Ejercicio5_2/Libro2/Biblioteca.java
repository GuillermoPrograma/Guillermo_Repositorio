package Programacion_objeto_Ejercicio5_2.Libro2;

import java.util.Scanner;

public class Biblioteca {
	Scanner entrada = new Scanner(System.in);
	private String nombre;
	private String ubicacion;
	
	Libro2 [] catalogo = new Libro2[entrada.nextInt()];

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Libro2[] getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(Libro2[] catalogo) {
		this.catalogo = catalogo;
	}
	
	public Biblioteca() 
	{
		this.nombre = "Predeterminado";
		this.ubicacion = "Predeterminado";
	}
	
	public void agregarLibro(Libro2 libro) 
	{
		
		
	}
	
}
