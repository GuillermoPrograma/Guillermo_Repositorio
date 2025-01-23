package Programacion_objeto_Ejercicio5_2.Pelicula;

public class Sala {

	private int numeroSala;
	private int capacidadMaxima;
	private Pelicula peliculaenProyeccion;
	private int[] numeroButaca;
	private boolean[] numeroButacaLibre ;
	
	
	//CONSTRUCTORES

	public Sala() {
		this.numeroSala = 0;
		this.capacidadMaxima = 0;
		this.numeroButaca = new int[capacidadMaxima];
		this.numeroButacaLibre = new boolean[capacidadMaxima];
		rellenoButacas();
	}

	public Sala(int numeroSala, int capacidadMaxima) {

		this.numeroSala = numeroSala;
		this.capacidadMaxima = capacidadMaxima;
		this.numeroButaca = new int[capacidadMaxima];
		this.numeroButacaLibre = new boolean[capacidadMaxima];
		rellenoButacas();

	}

	public Sala(int numeroSala, int capacidadMaxima, Pelicula peliculaenProyeccion) {

		this.numeroSala = numeroSala;
		this.capacidadMaxima = capacidadMaxima;
		this.peliculaenProyeccion = peliculaenProyeccion;
		this.numeroButaca = new int[capacidadMaxima];
		this.numeroButacaLibre = new boolean[capacidadMaxima];
		rellenoButacas();
	}
	
	//FUNCIONES

	public void asignarPelicula(Pelicula pelicula) {

		this.peliculaenProyeccion = pelicula;
	}

	public boolean estaDisponible() {
		boolean disponible = false;
		if (this.peliculaenProyeccion != null)
			disponible = true;

		return disponible;
	}

	public void mostrarInformacionSala() {
		System.out.println("Numero de Sala : " + this.numeroSala);
		System.out.println("Capacidad Máxima : " + this.capacidadMaxima);
		if (estaDisponible() == true)
			System.out.println("Pelicula en Ptoyección : " + this.peliculaenProyeccion);
	}

	public int generaButaca() {
		int numElegido = 0;
		boolean bucle = true;
		while (bucle == true) {
			int numButaca = (int) (0 + Math.random() * (this.capacidadMaxima - 1 + 1));
			if (this.numeroButacaLibre[numButaca] == false) {
				this.numeroButacaLibre[numButaca] = true;
				numElegido = numButaca;
				bucle = false;

			}
		}
		return numeroButaca[numElegido];
	}

	private void rellenoButacas() {

		for (int i = 0; i < this.numeroButaca.length; i++) {
			numeroButaca[i] = i + 1;

		}

	}
	
	//GETTERS Y SETTERS

	public int getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public Pelicula getPeliculaenProyeccion() {
		return peliculaenProyeccion;
	}

	public void setPeliculaenProyeccion(Pelicula peliculaenProyeccion) {
		this.peliculaenProyeccion = peliculaenProyeccion;
	}

	public int[] getNumeroButaca() {
		return numeroButaca;
	}

	public void setNumeroButaca(int[] numeroButaca) {
		this.numeroButaca = numeroButaca;
	}
}
