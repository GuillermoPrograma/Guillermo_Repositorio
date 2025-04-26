package UD11.III.ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CRUD {

	static File archivo = new File("inventario.csv");
	static List<Producto> listaProductos = new ArrayList<>();
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int menu = -1;
		empiezoArchivo();
		while (menu != 0) {
			System.out.println("MENU : 0 Salir, 1 Crear , 2 Leer , 3 Actualizar , 4 Listar , 5 Eliminar");
			menu = entrada.nextInt();
			switch (menu) {
			case 0:
				System.out.println("finalizando");
				break;
			case 1:
				crearObjeto();
				break;
			case 2:
				leerObjeto();
				break;
			case 3:
				actualizarObjeto();
				break;
			case 4:
				listarObjeto();
				break;
			case 5:
				eliminarObjeto();
				break;
			default:
				System.out.println("numero no valido");
				menu = entrada.nextInt();

			}

		}

	}

	public static void empiezoArchivo() {
		try (FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(archivo);
				PrintWriter pw = new PrintWriter(fw);) {
			String linea;
			if ((linea = br.readLine()) == null) {
				pw.println("Nombre,Precio,Stock");
			} else {
				while ((linea = br.readLine()) != null) {
					String[] palabras = linea.split(",");
					listaProductos.add(
							new Producto(palabras[0], Double.parseDouble(palabras[1]), Integer.parseInt(palabras[2])));
				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void crearObjeto() {
		System.out.println("NombreProducto:");
		String nombre = entrada.next();
		System.out.println("Precio");
		Double precio = entrada.nextDouble();
		System.out.println("CantidadStock");
		int cantidad = entrada.nextInt();

		listaProductos.add(new Producto(nombre, precio, cantidad));
		actualizarExcel();
	}

	public static void leerObjeto() {
		System.out.println("nombre objeto");
		String nombre = entrada.next();
		for (Producto p : listaProductos) {
			if (p.getNombre().equals(nombre)) {
				System.out.println(p.toString());
			}
		}

	}

	public static void actualizarObjeto() {
		System.out.println("Nombre");
		String nombre = entrada.next();
		for (Producto p : listaProductos) {
			if (p.getNombre().equals(nombre)) {
				System.out.println("Precio");
				double precio = entrada.nextDouble();
				System.out.println("cantidadStock");
				int stock = entrada.nextInt();
				p.setPrecio(precio);
				p.setCantidadStock(stock);
			}

		}
		actualizarExcel();

	}

	public static void listarObjeto() {
		System.out.println(listaProductos);
	}

	public static void actualizarExcel() {
		try (FileWriter fw = new FileWriter(archivo); PrintWriter pw = new PrintWriter(fw);) {
			pw.println("Nombre,Precio,Stock");
			for (Producto p : listaProductos) {
				pw.println(p.getNombre() + "," + p.getPrecio() + "," + p.getCantidadStock());

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void eliminarObjeto() {

		Iterator<Producto> it = listaProductos.iterator();
		System.out.println("NombreProducto a eliminar:");
		String nombre = entrada.next();

		while (it.hasNext()) {
			Producto pr = it.next();
			if (pr.getNombre().equals(nombre)) {

				it.remove();

			}
		}

	}
}
