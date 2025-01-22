package Programacion_objeto_Ejercicio5_2.Libro2;

public class Libro2 {

	private String libro;
	private String autor;
	private int numeroPaginas;

 
 
 
 
	public Libro2() {
		this.libro = "Desconocido";
		this.autor = "Anonimo";
		this.numeroPaginas = 0;

	}

	public Libro2(String libro, String autor) {
		this.libro = libro;
		this.autor = autor;
		this.numeroPaginas = 0;
	}

	public Libro2(String libro, String autor, int numPaginas) {
		this.libro = libro;
		this.autor = autor;
		this.numeroPaginas = numPaginas;
	}

	public boolean esCorto() {
		boolean esCorto = false;
		if (this.numeroPaginas >= 100)
			esCorto = true;

		return esCorto;
	}

	public boolean esIgual(Libro2 l1) {
		boolean esIgual = false;
		if (this.libro == l1.libro && this.autor == l1.autor) {
			esIgual = true;

		}
		return esIgual;
	}
	public boolean esIgual(String libro, String autor) {
		boolean esIgual = false;
		if (this.libro == libro && this.autor == autor) {
			esIgual = true;

		}
		return esIgual;

	}

	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	

}
