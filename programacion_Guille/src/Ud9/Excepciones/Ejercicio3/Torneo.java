package Ud9.Excepciones.Ejercicio3;

public class Torneo {

	private String nombre;
	private Nivel nivel;
	int contador = 0;
	Jugadores jugadoresInscritos[] = new Jugadores[10];

	public Torneo(String nombre, Nivel nivel) {
		this.nombre = nombre;
		this.nivel = nivel;
	}

	public void AgregarJugadores(Jugadores j)
			throws EdadInvalidaException, TorneoIvalidoException, PuntosInvalidosException {
		if (j.getNivel() == Nivel.juvenil && j.getEdad() >= 12 && j.getEdad() <= 17 && this.nivel == Nivel.juvenil
				|| j.getEdad() >= 18 && j.getNivel() == Nivel.profesional && j.getPuntos() >= 200
						&& this.nivel == Nivel.profesional) {
			if (contador < jugadoresInscritos.length) {
				jugadoresInscritos[contador] = j;
				contador++;
			}
		} else if (j.getEdad() < 18 && j.getNivel() == Nivel.profesional
				|| j.getNivel() == Nivel.juvenil && j.getEdad() < 12
				|| j.getNivel() == Nivel.juvenil && j.getEdad() > 18) {
			throw new EdadInvalidaException("Edad inválida");
		} else if (j.getNivel() != this.nivel) {
			throw new TorneoIvalidoException("El Nivel del jugador no es apto para este torneo");
		} else if (j.getNivel() == Nivel.profesional && j.getPuntos() < 200) {
			throw new PuntosInvalidosException("Los puntos son insuficientes");
		}
	}

	public void RegistrarResultados(Jugadores j, int resultados) {
		for (int i = 0; i < jugadoresInscritos.length; i++) {
			if (jugadoresInscritos[i] != null) {
				if (jugadoresInscritos[i].equals(j)) {
					j.setPuntos(j.getPuntos() + resultados);
				}
			}

		}

	}
}
