package UD11.III.ejercicio1;

public class estudiantes {

	String nombre ;
	int nota;
	
	estudiantes(String nombre, int nota) 
	{
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	
}
