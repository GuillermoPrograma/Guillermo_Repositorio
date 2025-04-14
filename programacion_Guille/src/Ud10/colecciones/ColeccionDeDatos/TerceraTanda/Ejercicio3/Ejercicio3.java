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
				
				linea = linea.replaceAll("[^a-zA-Z]", ",").toLowerCase();

				palabra = linea.split(",");

				for (String p : palabra) {
					if (p.isEmpty()) continue; //Esto es para mirar si las palabras estan vacias
					boolean encontrada = false;

					for (Contador c : lista) {
						if (c.getNombre().equals(p)) {
							c.setNum(c.getNum() + 1);
							encontrada = true;
						}

					}
					if (encontrada == false) {
						lista.add(new Contador(p, 1));
					}
				}

			}

			Contador max = new Contador("", 1);
			for (Contador c : lista) {
				System.out.println(c);
				if (c.getNum() >= max.getNum()) {
					max = c;
				}

			}
			System.out.println(max.getNombre());
			System.out.println(max.getNum());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
