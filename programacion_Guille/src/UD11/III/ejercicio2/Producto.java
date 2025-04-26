package UD11.III.ejercicio2;

public class Producto {
	String nombre;
	double precio;
	int cantidadStock;

	Producto(String nombre, double precio, int cantidadStock) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadStock = cantidadStock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidadStock=" + cantidadStock + "]";
	}
	
	
}
