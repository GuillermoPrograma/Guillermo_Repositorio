package Ud10.colecciones.ColeccionDeDatos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio1_PedirNombresPorConsola {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		try {
			FileWriter fw = new FileWriter("Ejercicio1.txt");
			PrintWriter bw = new PrintWriter(fw);
			System.out.println("pon el primer nombre");
			String nombres = entrada.next();

			while (!nombres.equalsIgnoreCase("fin")) {

				bw.println(nombres);
				System.out.println("pon otro nombre");
				nombres = entrada.next();
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
