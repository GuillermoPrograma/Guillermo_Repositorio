package Programacion_objeto_Ejercicio5_2.Pelicula;

public class Cine {

	private String nombre;
	private String ubicacion;
	private Sala[] salas;

	// CONSTRUCTORES

	public Cine() {
		this.nombre = "Predeterminado";
		this.ubicacion = "Predeterminado";
	}

	public Cine(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;

	}

	public Cine(String nombre, String ubicacion, Sala[] salas) {

		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.salas = salas;

	}

	// FUNCIONES

	public Sala buscarSalaPorNumero(int numeroSala) {

		return salas[numeroSala - 1];

	}

	public void mostrarCartelera() {
		for (int i = 0; i < salas.length; i++) {
			System.out.println(salas[i].getPeliculaenProyeccion().getNombre());

		}

	}

	public int verificarCapacidadTotal() {
		int capacidadTotal = 0;
		for (int i = 0; i < salas.length; i++) {
			capacidadTotal += salas[i].getCapacidadMaxima();
		}
		return capacidadTotal;
	}

	public void ventaEntrada(int numSala) {
		Sala sala=this.buscarSalaPorNumero(numSala);
		
		System.out.println("NOMBRE DEL CINE : " + this.nombre);
		System.out.println("UBICACION DEL CINE : " + this.ubicacion);
		System.out.println("PELICULA EN PROYECCION: " + sala.getPeliculaenProyeccion().getNombre());
		System.out.println("NUMERO DE SALA: " + sala.getNumeroSala());
		System.out.println("NUMERO DE ASIENTO : " + sala.generaButaca());
		System.out.println("DURACION PELICULA : " + sala.getPeliculaenProyeccion().obtenerDuracionEnFormato());
		

	}
	
	//GETTERS AND SETTERS

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

	public Sala[] getSalas() {
		return salas;
	}

	public void setSalas(Sala[] salas) {
		this.salas = salas;
	}
}
