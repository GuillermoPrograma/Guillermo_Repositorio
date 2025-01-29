package Programacion_Estaticos.Ejercicio1;

public class Banco {

	private static double tasaInteres;
	private String nombre;
	
	

	
	
	public static double getTasaInteres() {
		return tasaInteres;
	}
	public static void setTasaInteres(double tasaInteres) {
		Banco.tasaInteres = tasaInteres;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
