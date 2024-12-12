package Practica1_PiratasyCodigo;

import java.util.Scanner;

public class Practicas1_PiratasyCodigos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int X = 0;
		int Y = 0;
		int Resp;
		boolean juego = true;
		boolean fin = false;
		// Nivel 1

		System.out.println("=== PIRATAS Y CÓDIGOS OCULTOS ===\r\n"
				+ "Hace mucho tiempo, en las profundidades del mar, el Capitán Barba Negra escondió\r\n"
				+ "un tesoro imposible de encontrar... a menos que resuelvas los códigos ocultos que\r\n"
				+ "lo protegen.\r\n"
				+ "El Capitán Marina, junto a su tripulación de valientes marineros, ha encontrado un\r\n"
				+ "mapa antiguo y se embarca en una misión para recuperar el tesoro. ¿Estás listo para\r\n"
				+ "unirte a la aventura? (Presiona Intro para continuar)\r\n" + "");

		System.out.println("La tripulación se encuentra en la isla Tortuga, buscando el primer código. Deben\r\n"
				+ "descifrar una clave oculta en las coordenadas de un mapa que encontraron. El\r\n"
				+ "Capitán Marina se da cuenta de que las coordenadas están codificadas como una\r\n"
				+ "suma de números pares consecutivos que faltan en el mapa.\r\n"
				+ "El código de la coordenada se obtiene sumando los números pares comprendidos\r\n"
				+ "entre el punto X y el punto Y (ambos inclusive). ¿Qué valor es?");

		X = (int) (1 + Math.random() * (10 - 1 + 1));
		Y = (int) (1 + Math.random() * (10 - 1 + 1));
		System.out.println("Numero X = " + X);
		System.out.println("Numero Y = " + Y);

		Resp = entrada.nextInt();

		if (Resp == (X + Y) && juego == true) {

			// Nivel 2

			System.out.println("Tras resolver el primer código, la tripulación se adentra en la selva. De repente,\r\n"
					+ "encuentran una estatua antigua con una inscripción que indica: \"Solo quien resuelva\r\n"
					+ "el productorio de la llave abrirá el camino al siguiente punto\". El código está\r\n"
					+ "compuesto por dos números, el número del guardián y el número del mapa, cuya\r\n"
					+ "resta descendente, incluyendo ambos valores, debe ser calculada. ¿Qué código\r\n"
					+ "crees que puede ser?");

			int NumGuard = (int) (1 + Math.random() * (7 - 1 + 1));
			int NumMap = (int) (8 + Math.random() * (12 - 8 + 1));
			int Numcontador = 0;
			System.out.println("Numero Guardian = " + NumGuard);
			System.out.println("Numero del Mapa = " + NumMap);
			for (int i = NumGuard; i <= (NumMap - 1); i++) {

				Numcontador += i;
			}

			Numcontador = NumMap - Numcontador;
			Resp = entrada.nextInt();

			if (Resp == (Numcontador) && juego == true) {

				// Nivel 3

				System.out.println("Superan la selva y llegan a una cueva. Para entrar, deben desactivar una trampa\r\n"
						+ "mortal usando un código antiguo que solo los piratas más astutos conocen. La pista\r\n"
						+ "dice que el código es el factorial del número de entradas de la cueva dividido entre\r\n"
						+ "2, redondeando hacia abajo. ¿Sabrías decir cuál es ese número?");

				int entradas = (int) (2 + Math.random() * (20 - 2 + 1));
				int factorial = 1;
				System.out.println("Entradas = " + entradas);

				for (int i = 1; i < (entradas / 2) + 1; i++) {

					factorial = i * factorial;

				}

				Resp = entrada.nextInt();

				if (Resp == factorial && juego == true) {

					// Nivel 4

					System.out.println("Dentro de la cueva, encuentran un antiguo cofre protegido por una cerradura\r\n"
							+ "numérica. La inscripción dice: \"Solo si puedes descifrar si los dos números que se\r\n"
							+ "proporcionarán son amigos, lograrás abrirlo\". El jugador debe verificar si los números\r\n"
							+ "dados son amigos. Sólo dime, 1 si crees que lo son o 0 si crees que no lo son.");

					int P = (int) (10 + Math.random() * (100 - 10 + 1));
					int Q = (int) (10 + Math.random() * (100 - 10 + 1));
					int divP = 0;
					int divQ = 0;
					boolean Nivel4 = false;
					System.out.println("Numero Q = " + Q);
					System.out.println("Numero P = " + P);
					for (int i = 1; i <= 100; i++) {

						if (P % i == 0) {

							divP = divP + i;

						}

						if (Q % i == 0) {

							divQ = divQ + i;

						}

					}

					Resp = entrada.nextInt();

					if (divP == Q && Resp == 1 || divQ == P && Resp == 1) { // Nivel 4

						Nivel4 = true;

					} else if (divP != Q && Resp == 0 || divQ != P && Resp == 0) {

						Nivel4 = true;

					}

					if (Nivel4 == true) // Entramos al nivel 5 por aquí porque si hay dos ifs habría que repetir dos
										// veces el proceso
					{
						// Nivel5
						System.out.println(
								"Encima del cofre se puede apreciar una hoja de papel. Nada más acercarte, se tapa la entrada de la cueva.\r\n"
										+ "Es un nota en la que pone \"La bomba está activada,\r\n"
										+ "si quieres salir de aquí con vida tendrás que sumar los números R y T  \r\n "
										+ "y decir si son multiplos de 5.\"  \r\n"
										+ "1 si crees que lo son o 0 si crees que no lo son \r\n");

						int R = (int) (10 + Math.random() * (100 - 10 + 1));
						int T = (int) (10 + Math.random() * (100 - 10 + 1));
						System.out.println("Número R = " + R);
						System.out.println("Numero T = " + T);

						Resp = entrada.nextInt();
						if ((R + T) % 5 == 0 && Resp == 1 || (R + T) % 5 != 0 && Resp == 0) {

							// Ganar
							System.out.println(
									"El Capitán Marina introduce el código correcto, desactivando la bomba. La tripulación\r\n"
											+ "abre el cofre y descubre el gran tesoro de Barba Negra. ¡El oro y las joyas son suyas!\r\n"
											+ "Han triunfado gracias a su astucia y habilidades matemáticas. ¡Felicidades!");
							fin = true;
						} else {
							// Nivel 5
							juego = false;

						}
					}

					else {

						// Nivel 4

						juego = false;

					}

				} else {
					// Nivel 3

					juego = false;
				}

			} else {

				// Nivel 2

				juego = false;

			}

		} else {

			// Nivel 1

			juego = false;

		}
		if (juego == false) {
			System.out.println("El código no era correcto... La misión ha fracasado y el tesoro permanecerá perdido\r\n"
					+ "para siempre. Inténtalo de nuevo y demuestra que eres digno del tesoro pirata.\r\n");
			fin = true;

		}
		if (fin == true)
			System.out.println("Gracias por jugar");

	}
}
