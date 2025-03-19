package Ud9.Excepciones.CuentasBancarias;

public class Banco {

	private CuentasBancarias cuentas[] = new CuentasBancarias[5];

	public void retirarDinero(CuentasBancarias c, double retirar) {

		for (int i = 0; i < cuentas.length; i++) {

			if (cuentas[i].equals(c)) {
				if(cuentas[i].getCuenta() > retirar)
				cuentas[i].setCuenta(cuentas[i].getCuenta() - retirar);
				else
					throw 
			}

		}
	}
}
