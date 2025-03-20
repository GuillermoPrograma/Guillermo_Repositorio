package Ud9.Excepciones.CuentasBancarias;

public class GestionamosBanco {
	public static void main(String[] args) throws saldoInsuficienteExcepcion {
		CuentasBancarias cuenta1 = new CuentasBancarias("EO", 100);
		CuentasBancarias cuenta2 = new CuentasBancarias("EE", 50);
		CuentasBancarias bc[] = new CuentasBancarias[2];
		bc[0] = cuenta1;
		bc[1] = cuenta2;
		Banco bank = new Banco(bc);
		bank.retirarDinero(cuenta2, 200);

	}
}
