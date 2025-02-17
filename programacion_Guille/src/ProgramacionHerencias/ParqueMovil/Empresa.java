package ProgramacionHerencias.ParqueMovil;

public class Empresa {

	String nombre;
	int tamFlota;
	Vehiculo[] Flota;

	public Empresa(int tamFlota, Vehiculo[] vehiculos, String nombre) {
		this.tamFlota = tamFlota;
		Flota = new Vehiculo[tamFlota];
		this.nombre = nombre;
	}

	public void buscarVehiculo(Vehiculo v1) {
		boolean vehiculoEncon = false;
		for (int i = 0; i < Flota.length; i++) {
			if (v1.equals(Flota[i])) {
				System.out.println(v1.toString());
				vehiculoEncon = true;
			}
		}
		if (vehiculoEncon == false)
			System.out.println("no existe vehiculo dentro de la flota");

	}

	public void comprar(Vehiculo v1) {
		 boolean comprado = false;
		for (int i = 0; i < Flota.length; i++) {
			if (Flota[i] == null && comprado == false) {
				Flota[i] = v1;
				comprado = true;
			}

		}

	}

	public void vender(Vehiculo v1) {
		boolean encontrado = false;
		for (int i = 0; i < Flota.length; i++) {
			if (Flota[i] != null && Flota[i].equals(v1)) {
				Flota[i] = null;
				encontrado = true;
			}

		}
		if (encontrado == false) {
			System.out.println("Vehiculo no encontrado");
		}
	}

	public void muestro() {
		for (int i = 0; i < Flota.length; i++) {
			if (Flota[i] != null) {
				System.out.println(Flota[i].toString());
			} else {
				System.out.println("No vehiculos");
			}

		}

	}

	public String getNombre() {
		return nombre;
	}

	public int getTamFlota() {
		return tamFlota;
	}

	public Vehiculo[] getFlota() {
		return Flota;
	}

}
