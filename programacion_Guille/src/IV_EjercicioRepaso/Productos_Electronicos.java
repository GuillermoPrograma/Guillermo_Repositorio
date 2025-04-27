package IV_EjercicioRepaso;

public abstract class Productos_Electronicos implements Volador{

	private String marca;
	private String modelo;
	private double precio;
	
	
	Productos_Electronicos(String marca, String modelo, double precio) {

		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
