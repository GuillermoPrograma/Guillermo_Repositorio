package ud1.ejercicios;

import java.util.Scanner;

public class Contraseña {

	public static void main(String[] args) {
		String contraseña;
		String intento;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe contraseña");
		contraseña = entrada.next();

		for (int i = 0; i <= 2; i++) {
			System.out.println("Intento" + (i + 1));
			intento = entrada.next();
			
			if (intento.equals(contraseña)) {
				System.out.println("Contraseña correcta");
				entrada.close();
				break;

			}
			if (!intento.equals(contraseña)) {
				System.out.println("te quedan " + ( 2 - i) + " intentos");
				
			}

			
		}

	}
	
}
