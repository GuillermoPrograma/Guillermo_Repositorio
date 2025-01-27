package Programacion_objeto_Ejercicio5_2.Pelicula;

import java.util.Scanner;

public class GestionamosCines {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Pelicula p1 = new Pelicula("Gladiator", "Aventura", 160, 16);
		Pelicula p2 = new Pelicula("LaLaLand", "Romántica", 200, 15);
		Pelicula p3 = new Pelicula("Lo que el viento se llevó", "Clásica", 360, 10);

		Sala s1 = new Sala(1, 20, p1);
		Sala s2 = new Sala(2, 30, p2);
		Sala s3 = new Sala(3, 20, p3);
		Sala s4 = new Sala(4, 30, p1);

		Sala[] salas = new Sala[4];
		salas[0] = s1;
		salas[1] = s2;
		salas[2] = s3;
		salas[3] = s4;

		Cine c1 = new Cine("Renoir", "Plaza Espania", salas);
		System.out.println("***");
		c1.mostrarCartelera();
		c1.ventaEntrada(3);
		System.out.println(" ");
		for (int i = 0; i < salas.length; i++) {
			System.out.println(c1.getSalas()[i].getPeliculaenProyeccion().getNombre());
		}
		System.out.println(c1.verificarCapacidadTotal());
		System.out.println("Dime numero de sala del 1 al 4");
		int num = entrada.nextInt();
		System.out.println(c1.buscarSalaPorNumero(num).getCapacidadMaxima());
		System.out.println(c1.buscarSalaPorNumero(num).getPeliculaenProyeccion().getNombre());
		System.out.println("Dame la edad del usuario : ");
		int edad = entrada.nextInt();
		if (c1.buscarSalaPorNumero(num).getPeliculaenProyeccion().esAptaParaEdad(edad) == false)
			System.out.println("No recomendado");
		else
			System.out.println("Puede ir");
	}

}
