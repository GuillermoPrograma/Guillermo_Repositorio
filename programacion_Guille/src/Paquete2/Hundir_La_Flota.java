package Paquete2;

import java.util.Scanner;

public class Hundir_La_Flota {
	public static void main(String[] args) {
		char[][] tablero = crearTablero();

	}

	public static char[][] crearTablero() // creamos un tablero de 09, 09 donde luego se instaciaran los barcos
	{
		char[][] tablero = new char[9][9];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; i++) {
				tablero[i][j] = 'a';
			}

		}

		return tablero;
	}

	public static int[][] instanciarLancha(int[][] tablero) {
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

	public static int[][] instanciarBuque(int[][] tablero) {
		boolean instanciado = false;
		while (instanciado == false) {
			int numFilas = (int) (0 + Math.random() * (9 - 0 + 1));
			int numColumnas = (int) (0 + Math.random() * (9 - 0 + 1));

			if (tablero[numFilas][numColumnas] == 'a' && tablero[numFilas + 1][numColumnas] == 'a' && tablero[numFilas + 2][numColumnas] == 'a') {
				tablero[numFilas][numColumnas] = 'B';
				tablero[numFilas + 1][numColumnas] = 'B';
				tablero[numFilas + 2][numColumnas] = 'B';
				instanciado = true;
			}
		}

		return tablero;
	}

	public static int[][] instanciarAcorazado(int[][] tablero) {
		boolean instanciado = false;
		while (instanciado == false) {
			int numFilas = (int) (0 + Math.random() * (9 - 0 + 1));
			int numColumnas = (int) (0 + Math.random() * (9 - 0 + 1));

			if (tablero[numFilas][numColumnas] == 'a' && tablero[numFilas + 1][numColumnas] == 'a'
					&& tablero[numFilas + 2][numColumnas] == 'a' && tablero[numFilas + 3][numColumnas] == 'a') {
				tablero[numFilas][numColumnas] = 'B';
				tablero[numFilas + 1][numColumnas] = 'B';
				tablero[numFilas + 2][numColumnas] = 'B';
				tablero[numFilas + 3][numColumnas] = 'B';
				instanciado = true;
			}
			
		}
		

		return tablero;

	}
	public static int[][] instanciarPoortaviones(int[][] tablero) {
		boolean instanciado = false;
		while (instanciado == false) {
			int numFilas = (int) (0 + Math.random() * (9 - 0 + 1));
			int numColumnas = (int) (0 + Math.random() * (9 - 0 + 1));

			if (tablero[numFilas][numColumnas] == 'a' && tablero[numFilas + 1][numColumnas] == 'a'
					&& tablero[numFilas + 2][numColumnas] == 'a' && tablero[numFilas + 3][numColumnas] == 'a') {
				tablero[numFilas][numColumnas] = 'B';
				tablero[numFilas + 1][numColumnas] = 'B';
				tablero[numFilas + 2][numColumnas] = 'B';
				tablero[numFilas + 3][numColumnas] = 'B';
				instanciado = true;
			}
		}
		
		//hola
		return tablero;
	}

}
