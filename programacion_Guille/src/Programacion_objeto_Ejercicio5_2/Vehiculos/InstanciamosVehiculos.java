package Programacion_objeto_Ejercicio5_2.Vehiculos;

public class InstanciamosVehiculos {
public static void main(String[] args) {
	
	Vehiculo v1 = new Vehiculo ("Suzuki Ignis 2000","Suzuki", 200);
	Vehiculo v2 = new Vehiculo ("seat");
	Vehiculo v3= new Vehiculo ("Seat ibiza" , "Seat" , 160);
	Vehiculo v4= new Vehiculo ("Seat ibiza" , "Seat" , 160);
	v1.acelerar(160);
	v2.acelerar(40);
	v3.acelerar(40);
	System.out.println(v3.getVelocidadMaxima());
	v3.detener();
	
	
	System.out.println(v4.esIgual(v2.getMarca(), v2.getModelo(), v2.getVelocidadMaxima()));
	System.out.println(v2.esIgual(v3));
	
	System.out.println(v4.esIgual(v3));
	
}
}
