package Ud9.Excepciones.Ejercicio3;

public class Torneo {

	private String nombre;
	private Nivel nivel;
	int contador = 0;
	Jugadores jugadoresInscritos[] = new Jugadores[10];

	public void AgregarJugadores(Jugadores j) throws EdadInvalidaException {
		if (j.getNivel() == Nivel.juvenil && j.getEdad() >= 12 && j.getEdad() <= 17 && this.nivel == Nivel.juvenil
				||j.getEdad() >= 18 && j.getNivel() == Nivel.profesional && j.getPuntos() >= 200 && this.nivel == Nivel.profesional) {
			if (contador < 10) {
				jugadoresInscritos[contador] = j;
				contador++;
			}
		} else {
			throw new EdadInvalidaException("Datos inválidos");
		}
	}

	public void RegistrarResultados(Jugadores j, int resultados) {
		j.setPuntos(j.getPuntos() + resultados);
	}
}
