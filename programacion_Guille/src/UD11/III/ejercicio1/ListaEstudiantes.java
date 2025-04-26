package UD11.III.ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListaEstudiantes {
	public static void main(String[] args) {
		File archivo = new File("registroEstudiantes.txt");
		try (FileWriter fw = new FileWriter(archivo); PrintWriter bw = new PrintWriter(fw);) {
			List<estudiantes> listaEstudiantes = new ArrayList<>();

			listaEstudiantes.add(new estudiantes("Guille", 8));
			listaEstudiantes.add(new estudiantes("David", 6));
			listaEstudiantes.add(new estudiantes("Maria", 4));

			bw.println("Nombres|Notas");
			for (estudiantes e : listaEstudiantes) {
				bw.println(e.getNombre() + "|" + e.getNota());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			try (FileReader pr = new FileReader(archivo); BufferedReader br = new BufferedReader(pr);) {
				String linea;
				br.readLine();

				while ((linea = br.readLine()) != null) {
					String[] palabras = linea.split("\\|");
					if (Integer.parseInt(palabras[1]) >= 5) {
						System.out.println("Nombre Alumno aprobado :" + palabras[0]);
					}
				}
			}
			 catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}
}
