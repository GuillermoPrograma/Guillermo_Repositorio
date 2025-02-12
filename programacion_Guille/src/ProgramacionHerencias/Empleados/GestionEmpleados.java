package ProgramacionHerencias.Empleados;

public class GestionEmpleados {

	public static void main(String[] args) {
		
		Repartidores r1 = new Repartidores ("Torres",24,1500,"zona3");
		
		Comercial c1 = new Comercial("Manuel",32,2000,250);
		
		r1.Plus();
		c1.plus();
		
		System.out.println(r1.getSalario());
		System.out.println(c1.getSalario());
		
	}
	
}
