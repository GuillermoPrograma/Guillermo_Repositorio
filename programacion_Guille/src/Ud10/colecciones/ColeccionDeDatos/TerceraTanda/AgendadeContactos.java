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
		try (FileWriter fw = new FileWriter(archivo, true);
				PrintWriter pw = new PrintWriter(fw);
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);) {
			Scanner entrada = new Scanner(System.in);

			if (br.readLine() == null) {

				pw.println("Nombes,Teléfonos");
				System.out.println("Nombre: ");
				pw.print(entrada.next() + ",");
				System.out.println("Teléfono: ");
				pw.println(entrada.next() + ",");

			} else {
				List<Contactos> lista = new ArrayList<>();
				String linea;

				while ((linea = br.readLine()) != null) {
					String[] palabra = linea.split(",");
					for (int i = 0; i < palabra.length; i++) {

						lista.add(new Contactos(palabra[i], palabra[i + 1]));
						i++;
					}

				}
				for (Contactos c : lista) {
					System.out.println(c);
				}

				System.out.println("Nombre: ");
				pw.print(entrada.next() + ",");
				System.out.println("Telefono: ");
				pw.println(entrada.next() + ",");

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
