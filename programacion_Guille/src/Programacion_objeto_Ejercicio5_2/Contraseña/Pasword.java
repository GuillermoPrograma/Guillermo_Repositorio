package Programacion_objeto_Ejercicio5_2.Contraseña;

public class Pasword {

	int longitud = 8;
	String contraseña = "";

	public Pasword() {
	}

	public Pasword(int longitud) {
		this.longitud = longitud;
	}

	public boolean esFuerte(){
		boolean esFuerte = false;
		int mayus = comprobarContraseñaMayuscula(this.contraseña);
		int minus = comprobarContraseñaMinuscula(this.contraseña);
		int num = comprobarContraseñaNumero(this.contraseña);

		if (mayus >= 6 && minus >= 1 && num >= 5) {
			esFuerte = true;
		}

		return esFuerte;
	}

	public int comprobarContraseñaMayuscula(String t) {
		int contadorMayusculas = 0;

		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) >= 'A' && t.charAt(i) <= 'Z') {
				contadorMayusculas = contadorMayusculas + 1;
			}
		}
		return contadorMayusculas;
	}

	public int comprobarContraseñaMinuscula(String t) {
		int contadorMinusculas = 0;

		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) >= 'a' && t.charAt(i) <= 'z') {
				contadorMinusculas = contadorMinusculas + 1;

			}
		}
		return contadorMinusculas;

	}

	public int comprobarContraseñaNumero(String t) {
		int contadorNumero = 0;

		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) >= '0' && t.charAt(i) <= '9') {
				contadorNumero = +contadorNumero + 1;
			}
		}
		return contadorNumero;

	}

	public void generarPassword() {
		String contrasenia = "";
		char c;

		for (int i = 0; i < this.longitud; i++) {
			if (comprobarContraseñaMinuscula(contrasenia) < 1) {
				c = (char) (97 + Math.random() * (122 - 97 + 1));
				contrasenia = contrasenia + c;
			}
			if (comprobarContraseñaMayuscula(contrasenia) < 6) {
				c = (char) (65 + Math.random() * (90 - 65 + 1));
				contrasenia = contrasenia + c;
				if (comprobarContraseñaNumero(contrasenia) < 5) {
					c = (char) (48 + Math.random() * (57 - 48 + 1));
					contrasenia = contrasenia + c;
				}
			}

		}
		System.out.println(contrasenia);

		this.contraseña = contrasenia;

	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

}
