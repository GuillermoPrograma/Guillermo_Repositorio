package Paquete2;

import java.util.Scanner;

public class Hundir_La_Flota {

	public static void main(String[] args) {

		char[][] tablero = new char[10][10];
		int nIntentos = 0;
		tablero = crearTablero(tablero);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Elige modo: 1 Facil, 2 Medio, 3 Dificil");
		int modo = entrada.nextInt();
		switch (modo) {
		case (1):
			tablero = modoFacil(tablero);
			nIntentos = 50;
			IniciarJuego(tablero, nIntentos);
			break;
		case (2):
			tablero = modoMedio(tablero);
			nIntentos = 40;
			IniciarJuego(tablero, nIntentos);

		case (3):
			tablero = modoDificil(tablero);
			nIntentos = 30;
			IniciarJuego(tablero, nIntentos);

			break;
		default:
			System.out.println("Tiene que ser del 1 al 3");

			break;
		}

	}

	public static void IniciarJuego(char[][] tablero, int intentos) {

		boolean ganado = false;

		while (intentos > 0 && ganado == false) {
			enseñarMapaAdmin(tablero);
			enseñarMapaUsuario(tablero);
			tablero = disparo(tablero);
			enseñarMapaUsuario(tablero);
			intentos--;
			System.out.println("Numero de intentos : " + intentos);
			ganado = analizaMapa(tablero);
		}

		if (ganado == true) {
			System.out.println("Has Ganado!!");
		} else if (intentos == 0 && ganado == false) {
			System.out.println("Has perdido");

		}

	}

	public static boolean analizaMapa(char[][] tablero) {
		boolean ganado = true;
		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] != 'A' && tablero[i][j] != 'X' && tablero[i][j] != 'a') {
					ganado = false;
				} 
			}

		}
		return ganado;
	}

	public static char[][] disparo(char[][] tablero) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Disparo Columna :");
		int disparoColumna = entrada.nextInt();
		System.out.println("Disparo Fila :");
		int disparoFila = entrada.nextInt();

		if (tablero[disparoFila][disparoColumna] == 'a') {
			System.out.println("Fallo");
			tablero[disparoFila][disparoColumna] = 'A';
		} else {
			System.out.println("Dado");
			tablero[disparoFila][disparoColumna] = 'X';
		}
		return tablero;

	}

	public static void enseñarMapaUsuario(char[][] tablero) {

		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] == 'a' || tablero[i][j] == 'P' || tablero[i][j] == 'Z' || tablero[i][j] == 'B'
						|| tablero[i][j] == 'L')
					System.out.print("-" + "\t");
				else
					System.out.print(tablero[i][j] + "\t");
			}
			System.out.println("");
		}

	}

	public static void enseñarMapaAdmin(char[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + "\t");
			}
			System.out.println("");
		}

	}

	public static char[][] crearTablero(char[][] tablero) // creamos un tablero de 09, 09 donde luego se instaciaran los
															// barcos
	{

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = 'a';
			}

		}

		return tablero;
	}

	public static char[][] modoFacil(char[][] tablero) {

		for (int i = 0; i < 5; i++) {
			tablero = instanciarLancha(tablero);
		}
		for (int i = 0; i < 3; i++) {
			tablero = instanciarBuque(tablero);
		}
		tablero = instanciarAcorazado(tablero);
		tablero = instanciarPoortaviones(tablero);
		return tablero;
	}

	public static char[][] modoMedio(char[][] tablero) {

		for (int i = 0; i < 8; i++) {
			tablero = instanciarLancha(tablero);
		}
		for (int i = 0; i < 6; i++) {
			tablero = instanciarBuque(tablero);
		}
		tablero = instanciarAcorazado(tablero);
		for (int i = 0; i < 2; i++)
			tablero = instanciarPoortaviones(tablero);

		return tablero;
	}

	public static char[][] modoDificil(char[][] tablero) {

		for (int i = 0; i < 9; i++) {
			tablero = instanciarLancha(tablero);
		}
		for (int i = 0; i < 8; i++) {
			tablero = instanciarBuque(tablero);
		}
		tablero = instanciarAcorazado(tablero);
		for (int i = 0; i < 3; i++)
			tablero = instanciarPoortaviones(tablero);

		return tablero;
	}

	public static char[][] instanciarLancha(char[][] tablero) {
		boolean instanciado = false;
		while (instanciado == false) {
			int numFilas = (int) (0 + Math.random() * (9 - 0 + 1));
			int numColumnas = (int) (0 + Math.random() * (9 - 0 + 1));

			if (tablero[numFilas][numColumnas] == 'a') {
				tablero[numFilas][numColumnas] = 'L';
				instanciado = true;
			}

		}

		return tablero;
	}

	public static char[][] instanciarBuque(char[][] tablero) {
		boolean instanciado = false;
		while (instanciado == false) {
			int numFilas = (int) (0 + Math.random() * (9 - 0 + 1));
			int numColumnas = (int) (0 + Math.random() * (7 - 0 + 1));

			if (tablero[numFilas][numColumnas] == 'a' && tablero[numFilas][numColumnas + 1] == 'a'
					&& tablero[numFilas][numColumnas + 2] == 'a') {
				tablero[numFilas][numColumnas] = 'B';
				tablero[numFilas][numColumnas + 1] = 'B';
				tablero[numFilas][numColumnas + 2] = 'B';
				instanciado = true;
			}

		}

		return tablero;
	}

	public static char[][] instanciarAcorazado(char[][] tablero) {
		boolean instanciado = false;
		while (instanciado == false) {
			int numCol = (int) (0 + Math.random() * (9 - 0 + 1));
			int numFilas = (int) (0 + Math.random() * (6 - 0 + 1));

			if (tablero[numCol][numFilas] == 'a' && tablero[numCol][numFilas + 1] == 'a'
					&& tablero[numCol][numFilas + 2] == 'a' && tablero[numCol][numFilas + 3] == 'a') {
				tablero[numCol][numFilas] = 'Z';
				tablero[numCol][numFilas + 1] = 'Z';
				tablero[numCol][numFilas + 2] = 'Z';
				tablero[numCol][numFilas + 3] = 'Z';
				instanciado = true;
			}

		}

		return tablero;

	}

	public static char[][] instanciarPoortaviones(char[][] tablero) {
		boolean instanciado = false;
		while (instanciado == false) {
			int numFilas = (int) (0 + Math.random() * (5 - 0 + 1));
			int numColumnas = (int) (0 + Math.random() * (9 - 0 + 1));

			if (tablero[numFilas][numColumnas] == 'a' && tablero[numFilas + 1][numColumnas] == 'a'
					&& tablero[numFilas + 2][numColumnas] == 'a' && tablero[numFilas + 3][numColumnas] == 'a') {
				tablero[numFilas][numColumnas] = 'P';
				tablero[numFilas + 1][numColumnas] = 'P';
				tablero[numFilas + 2][numColumnas] = 'P';
				tablero[numFilas + 3][numColumnas] = 'P';
				instanciado = true;
			}

		}

		return tablero;
	}

}
