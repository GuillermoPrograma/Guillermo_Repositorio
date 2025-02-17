package ProgramacionHerencias.ParqueMovil;

public class GestionamosVehiculos {
public static void main(String[] args) {
	Vehiculo v1 = new Vehiculo(2020 ,"opel",6,500);
	Coche c1 = new Coche(2018,"Suzuki",600,"azul",5,false);
	Camion ca1 = new Camion(2006,"VOLVO",6,900,900,400,"Fernando");
	Camion ca2 = new Camion(2018,"VOLVO",9,1000,1200,600,"Pili");
	
	v1.toString();
	System.out.println(c1.toString());
	System.out.println(ca1.toString());
	System.out.println(ca2.toString());
	
	
	c1.pintar("rojo");
	ca1.cargar(90);
	ca2.descargar(20);
	ca1.descargar(200);
	ca2.cargar(200);
	ca2.cambiarConductor("Alvaro");
	System.out.println(c1.toString());
	System.out.println(ca1.toString());
	System.out.println(ca2.toString());
	
	
	Vehiculo [] vehiculos = new Vehiculo[4];
	
	Empresa e1 = new Empresa(4,vehiculos,"Carlass");
	e1.muestro();
	e1.comprar(v1);
	e1.comprar(c1);
	e1.comprar(ca1);
	e1.muestro();
	e1.vender(ca1);
	e1.vender(ca2);
	e1.comprar(ca2);
	e1.muestro();
	e1.buscarVehiculo(ca1);
	e1.buscarVehiculo(v1);}
}
