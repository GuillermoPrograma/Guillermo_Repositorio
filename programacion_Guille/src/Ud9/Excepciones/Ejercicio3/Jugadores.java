package Ud9.Excepciones.Ejercicio3;

public abstract class Jugadores implements Competidor {

	private Nivel nivel;
	private int edad;
	private int puntos;

	public Jugadores(int edad, int puntos, Nivel nivel) {
		
		this.edad = edad;
		this.puntos = puntos;
		this.nivel = nivel;

	}

	public void ganarPuntos(int puntosNuevos) {

		this.puntos += puntosNuevos;
	}

	

	public void competir(Torneo torneo, int resultado) {
		torneo.registrarResultados(this, resultado);
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
