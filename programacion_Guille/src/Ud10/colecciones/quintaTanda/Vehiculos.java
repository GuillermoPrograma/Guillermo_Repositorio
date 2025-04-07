package Ud10.colecciones.quintaTanda;

public abstract class Vehiculos {

	private String matricula;
	private String marca;
	private String modelo;
	private String añoFabricacion;
	private boolean disponible;

	Vehiculos(String matricula, String marca, String modelo, String añoFabricacion) {
		this.marca = marca;
		this.matricula = matricula;
		this.modelo = modelo;
		this.añoFabricacion = añoFabricacion;
	}

	void alquilarVehiculo() throws alquilerException {
		if (this.disponible == false)
			throw new alquilerException("el coche se encuentra alquilado");
		else
			this.disponible = false;
	}

	void devolverVehiculo() throws alquilerException {
		if (this.disponible == true)
			throw new alquilerException("el coche no se encuentra alquilado");
		else
			this.disponible = true;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(String añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Vehiculos [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", añoFabricacion="
				+ añoFabricacion + ", disponible=" + disponible + "]";
	}

}
