package Ud10.colecciones.ColeccionDeDatos.TerceraTanda.Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("FrasesCelebres.txt"); BufferedReader br = new BufferedReader(fr);) {
			String linea = "";

			List<Contador> lista = new ArrayList<>();

			String[] palabra;
			while ((linea = br.readLine()) != null) {
				linea.replaceAll(" ", ",");
				linea.replaceAll("\\s+", ",");
				linea.replaceAll(".", ",");
				linea.replaceAll("\n", ",");

				linea.toLowerCase();

				palabra = linea.split(",");

				for (int j = 0; j < linea.length(); j++) {

					for (int i = 0; i < palabra.length; i++) {
						if (!lista.contains(palabra[i])) {
							lista.add(new Contador(palabra[i], 1));
						} else {
							for (Contador c : lista) {
								if (c.getNombre().equals(palabra[i])) {
									c.setNum(c.getNum() + 1);
								}
							}
						}
					}
				}
			}

			Contador max = new Contador("", 1);
			for (Contador c : lista) {

				if (c.getNum() >= max.getNum()) {
					max = c;
				}
				System.out.println(max.getNombre());
				
			}
			//System.out.println(max);
//			for (Contador c : lista) {
//
//				if (c.getNum() == max.getNum()) {
//					System.out.println("la palabra más repetida es:" + c.getNombre() + " Se ha repetido: " + c.getNum() + " veces");
//				}
//			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
