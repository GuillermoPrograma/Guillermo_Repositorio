package Ud7ejercicios4.Arrays;

public class Ejercicio6_Temperatura_modulos {

	public static void main(String[] args) {

		int numAleatorio = (int) (4 + Math.random() * (6 - 4 + 1));

		int numeros[][] = new int[numAleatorio][numAleatorio];

		int valorBajo = 0;
		int valorAlto = 0;

		
		valorBajo = numeros[1][1];
		valorAlto = numeros[1][1];
		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {

				numeros[i][j] = (int) (-50 + Math.random() * (50 - (-50) + 1));
				
				if (valorBajo > numeros[i][j]) {
					valorBajo = numeros[i][j];
				}
				if (valorAlto < numeros[i][j]) {
					valorAlto = numeros[i][j];
				}
				System.out.print(numeros[i][j] + "\t");

			}
			System.out.println(" ");
		}
		System.out.println("valor alto" + valorAlto);
		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {

				if (numeros[i][j] == valorAlto) {
					System.out.println("El número más alto es :" + valorAlto + " Está en la posición : " + i + j);
				}
				if (numeros[i][j] == valorBajo) {
					System.out.println("El número más bajo es :" + valorBajo + " Está en la posición : " + i + j);
				}

			}
		}
	}

}
