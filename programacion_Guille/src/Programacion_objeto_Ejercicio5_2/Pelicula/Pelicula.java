package Programacion_objeto_Ejercicio5_2.Pelicula;

public class Pelicula {

	private String nombre;
	private String genero;
	private int minutosDuracion;
	private int edadRecomendada;
	
	
	//CONSTRUCTORES

	public Pelicula() {

		this.nombre = "Predeterminado";
		this.genero = "Predeterminado";
		this.minutosDuracion = 0;
		this.edadRecomendada = 0;
	}
	
	public Pelicula(String nombre, String genero) 
	{
		
		this.nombre = nombre;
		this.genero = genero;
		
	}
	
	public Pelicula(String nombre, String genero, int minutosDuracion, int edadRecomendada) 
	{
		
		this.nombre = nombre;
		this.genero = genero;
		this.minutosDuracion = minutosDuracion;
		this.edadRecomendada = edadRecomendada;
	}
	
	
	//FUNCIONES
	
	public boolean esAptaParaEdad(int edadEspectador)
	{
		boolean apta = false;
		if(edadEspectador >= this.edadRecomendada) 
		apta = true;
		
		return apta;
	}
	
	public String obtenerDuracionEnFormato(int minutos) 
	{
		int horas = minutos/60;
		int mins = minutos%60;
		
		String devuelvo = "la duración es de " + horas + " horas y de " + mins + " minutos.";
		return devuelvo;
		
	}
	
	//GETTERS SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getMinutosDuracion() {
		return minutosDuracion;
	}

	public void setMinutosDuracion(int minutosDuracion) {
		this.minutosDuracion = minutosDuracion;
	}

	public int getEdadRecomendada() {
		return edadRecomendada;
	}

	public void setEdadRecomendada(int edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}
	
	
}
