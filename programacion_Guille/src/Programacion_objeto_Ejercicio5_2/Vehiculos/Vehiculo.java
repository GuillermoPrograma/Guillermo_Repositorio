package Programacion_objeto_Ejercicio5_2.Vehiculos;

public class Vehiculo {

	private String marca ;
	private String modelo ;
	private double velocidadMaxima ;

	public Vehiculo() {
		this.marca = "Generica";
		this.modelo = "Base";
		this.velocidadMaxima = 100.00;
		
	}
	

	public Vehiculo(String marca) {
		this.marca = marca;
	}

	public Vehiculo(String marca, String modelo, double velocidadMaxima) {

		this.marca = marca;
		this.modelo = modelo;
		this.velocidadMaxima = velocidadMaxima;
	}

	public void acelerar(double incremento) {

		if (velocidadMaxima < 300) {
			if (incremento >= (velocidadMaxima / 2)) {
				velocidadMaxima += incremento;
				System.out.println("Aceleración excesiva");
			} else {
				velocidadMaxima += incremento;
			}

		} else
			System.out.println("PELIGRO, Demasiado rápido");

	}

	public void detener() {

		velocidadMaxima = 0;
		System.out.println("Se ha detenido el vehiculo");

	}

	public boolean esIgual(Vehiculo v1) {
		boolean elmismo = false;
		if (this.marca == v1.marca && this.modelo == v1.modelo) {
			elmismo = true;
		}
		else if( this.velocidadMaxima - v1.velocidadMaxima <=  Math.abs(5))
			elmismo = true;
			
		return elmismo;
	}

	public boolean esIgual(String marca, String modelo, double velocidad) {
		boolean elmismo = false;
		if (this.marca == marca && this.modelo == modelo) {
			elmismo = true;
		}
		else if( this.velocidadMaxima - velocidad <= Math.abs(5))
			elmismo = true;
		
		return elmismo;
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

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	

}
