package Programacion_objeto_Ejercicio5_2.Pelicula;

public class Cine {

	String nombre;
	String ubicacion;
	Sala[] Salas = new Sala[4];

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
		this.Salas = salas;

	}

	// FUNCIONES

	public Sala buscarSalaPorNumero(int numeroSala) {

		return Salas[numeroSala - 1];

	}

	public void mostrarCartelera() {
		for (int i = 0; i < Salas.length; i++) {
			System.out.println(Salas[i].getPeliculaenProyeccion());

		}

	}

	public int verificarCapacidadTotal() {
		int CapacidadTotal = 0;
		for (int i = 0; i < Salas.length; i++) {
			CapacidadTotal += Salas[i].getCapacidadMaxima();
		}
		return CapacidadTotal;
	}

	public void ventaEntrada(Sala sala) {
		System.out.println("NOMBRE DEL CINE : " + this.nombre);
		System.out.println("UBICACION DEL CINE : " + this.ubicacion);
		System.out.println("PELICULA EN PROYECCION: " + sala.getPeliculaenProyeccion());
		System.out.println("NUMERO DE SALA: " + sala.getNumeroSala());
		System.out.println("NUMERO DE ASIENTO : " + sala.generaButaca());
		System.out.println("DURACION PELICULA : " + sala.getPeliculaenProyeccion()
				.obtenerDuracionEnFormato(sala.getPeliculaenProyeccion().getMinutosDuracion()));

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
		return Salas;
	}

	public void setSalas(Sala[] salas) {
		Salas = salas;
	}
}
