package Programacion_objeto;

public class GestionCuentaCorriente {
public static void main(String[] args) {
	CuentaCorriente c1= new CuentaCorriente("123AA", "Guillermo" , 500);
	
	CuentaCorriente c2 = new CuentaCorriente("05731755C", 3000);
	
	System.out.println("El nombre del titular de la cuenta c1 es : " + c1.nombre);
	
	c1.ingresarDinero(100);
	c1.sacarDinero(20);
	System.out.println(c1.Saldo);
	
	c2.ingresarDinero(50000);
	c2.sacarDinero(52999);
	System.out.println(c2.Saldo);
}
}
