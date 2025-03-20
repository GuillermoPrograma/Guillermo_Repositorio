package Ud9.Excepciones.Ejercicio3;

public  class Jugadores implements Competidor {
//He quitado que sea abstracto porque realmente todos los jugadores tienen los mismos atributos y métodos, lo único que cambia es el nivel
	//y es lo que comparo desde aquí
	private Nivel nivel;
	private int edad;
	private int puntos;
	
	public Jugadores(int edad, int puntos, Nivel nivel) 
	{
		//Habria una diferencia entre juveniles y profesionales sino pudiese haber un profesional menor de edad, sin embargo solo pone que un profesional
		// Menor de edad no puede inscribirse en torneos
		this.edad = edad;
		this.puntos = puntos;
		this.nivel = nivel;
		
	}
	
	public void GanarPuntos(int puntosNuevos) 
	{
		
		this.puntos += puntosNuevos;
	}

	public void inscribirseEnTorneo(Torneo torneo) throws EdadInvalidaException, TorneoIvalidoException 
	{
		torneo.AgregarJugadores(this);
		
	}
	public  void competir(Torneo torneo, int resultado) 
	{
		torneo.RegistrarResultados(this, resultado);
	}
	
	
	
	
	
	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Jugadores [nivel=" + nivel + ", edad=" + edad + ", puntos=" + puntos + "]";
	}
	
	
}
