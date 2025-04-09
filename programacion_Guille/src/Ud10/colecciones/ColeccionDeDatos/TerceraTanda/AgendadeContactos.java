package Ud10.colecciones.ColeccionDeDatos.TerceraTanda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendadeContactos {

	public static void main(String[] args) {
		File archivo = new File("agenda.csv");
		try (FileWriter fw = new FileWriter(archivo);
				PrintWriter pw = new PrintWriter(fw);
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);) {
			Scanner entrada = new Scanner(System.in);

			if (archivo.exists()) {
				boolean primeraLinea = false;
				while (primeraLinea == false) {
					System.out.println("No hay nombres ni teléfonos");
					pw.println("Nombes,Teléfonos");
					System.out.println("Nombre: ");
					pw.print(entrada.next()+",");
					System.out.println("Teléfono: ");
					pw.println(entrada.next());
					primeraLinea = true;
				}
				

			}
			else 
			{
				List<Contactos> lista = new ArrayList<>();
				String linea;
				br.readLine();
				while((linea = br.readLine()) != null)
				lista.add(linea);
				
				System.out.println(lista);
				
				
				System.out.println("Nombre: ");
				linea = entrada.next();
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
