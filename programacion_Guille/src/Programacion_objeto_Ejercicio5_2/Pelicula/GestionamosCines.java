package Programacion_objeto_Ejercicio5_2.Pelicula;

import java.util.Scanner;

public class GestionamosCines {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);	
	Pelicula p1 = new Pelicula("Gladiator","Aventura",160,16);
	Pelicula p2 = new Pelicula("LaLaLand","Romántica",200,15);
	Pelicula p3 = new Pelicula("Lo que el viento se llevó", "Clásica" , 360, 10);
	
	Sala s1 = new Sala(1,20,p1);
	Sala s2= new Sala(2,30,p2);
	Sala s3 = new Sala(3,20,p3);
	Sala s4 = new Sala(4,30,p1);
	
	Sala [] Salas = new Sala[4];
	Salas [0] = s1;
	Salas[1] = s2;
	Salas[2] = s3;
	Salas[3] = s4;
	
	
	Cine c1 = new Cine("Renoir" , "Plaza Espania", Salas);
	c1.ventaEntrada(s3);
	for(int i = 0; i < Salas.length; i++) 
	{
		System.out.println(c1.Salas[i].getPeliculaenProyeccion().getNombre());
	}
	System.out.println("Dime numero de sala del 1 al 4");
	int num = entrada.nextInt() ;
	System.out.println(c1.buscarSalaPorNumero(num).getCapacidadMaxima());
	System.out.println(c1.buscarSalaPorNumero(num).getPeliculaenProyeccion().getNombre());
	System.out.println("Dame la edad del usuario : ");
	int edad = entrada.nextInt();
	if (c1.buscarSalaPorNumero(num).getPeliculaenProyeccion().esAptaParaEdad(edad) == false)
		System.out.println("No recomendado" );
	else
		System.out.println("Puede ir");
	}
	
	
	
}
