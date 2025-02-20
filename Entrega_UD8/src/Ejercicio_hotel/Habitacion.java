package Ejercicio_hotel;

public abstract class Habitacion {

	private int numHabitacion;
	private final int precioBase = 100;
	private boolean disponible = true;
	private static int numTotalHabitaciones = 0;
	private Persona p;

	Habitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
		numTotalHabitaciones += 1; // Pienso que todas las habitaciones están disponibles de por si, solo cambia si
									// se reserva

	}

	public abstract void calcularCosteTotal();

	public void reservar(Persona p) {
		this.disponible = false;
		this.p = p;
	}

	public void mostrarCliente() {
		if (p != null) {
			System.out.println(p.toString());
		}
		else
			System.out.println("No hay cliente");

	}

	@Override
	public boolean equals(Object h1) {

		System.out.println("la habitacion nº " + this.numHabitacion + " es igual a la habitacion nº "
				+ ((Habitacion) h1).numHabitacion + ": ");
		// Simplemente pongo este Syso para dejarlo más claro luego el main, podría
		// hacerlo en otro Módulo pero no creo que merezca la pena
		if (this.numHabitacion == ((Habitacion) h1).numHabitacion) {
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		if (this.disponible)
			return "\nNúmero de habitación ***" + this.numHabitacion + "*** " + "\n***DISPONIBLE***";
		else
			return "\nNúmero de habitación ***" + this.numHabitacion + "*** " + "\n***NO DISPONIBLE***";
	}

	public int getNumHabitacion() {
		return numHabitacion;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public static int getNumTotalHabitaciones() {
		return numTotalHabitaciones;
	}

}
