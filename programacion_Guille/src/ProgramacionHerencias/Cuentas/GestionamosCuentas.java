package ProgramacionHerencias.Cuentas;

public class GestionamosCuentas {

	public static void main(String[] args) {
		
		 Titular titular1 = new Titular();
		titular1.setNombre("Guille");
		titular1.setApellidos("Garcia");
		titular1.setEdad(23);
		titular1.setSaldo(2000);
		
		Titular titular2 = new Titular();
		titular2.setNombre("Milka");
		titular2.setApellidos("FFGG");
		titular2.setEdad(26);
		titular2.setSaldo(100);
		
		CuentaCorriente cuenta1 = new CuentaCorriente(titular1,"ES203984",titular1.getSaldo());
		CuentaAhorro cuenta2 = new CuentaAhorro(titular2,"ES298784",titular2.getSaldo());
		
		cuenta1.Ingresar(200);
		cuenta1.Reintegro(2000);
		cuenta1.Imprimir();
		System.out.println("Cuenta2 :");
		cuenta2.Imprimir();
		cuenta2.CalcularInteres();
		cuenta2.Imprimir();
		System.out.println(cuenta2.getInteres());
	
		
	}
}
