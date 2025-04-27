package AgendaDeContactos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	static Scanner entrada = new Scanner(System.in);
	static File archivo = new File("agenda2.csv");
	static List <Contactos> listaContactos = new ArrayList <>();
	public static void main(String[] args) {
		leerAlIniciar();
		mostrarArray();
		modifico();
		
	}
	
	
	static void leerAlIniciar() 
	{
		try(FileReader fr = new FileReader(archivo); 
			BufferedReader br = new BufferedReader (fr);
			FileWriter fw = new FileWriter (archivo, true);
			PrintWriter pw = new PrintWriter (fw))
		{
			if (!archivo.exists()) {
			    archivo.createNewFile();
			}
			if(br.readLine() == null) 
			{
				pw.println("Nombre"+","+"Telefono");
				System.out.println("Nombre Nuevo");
				String nombre = entrada.next();
				System.out.println("Telefono Nuevo");
				int telefono =entrada.nextInt();
				pw.println(nombre + "," + telefono);
			}
			else
			{
				String linea;
				while((linea = br.readLine()) != null) 
				{
					String[] palabras = linea.split(",");
					listaContactos.add(new Contactos(palabras[0],Integer.parseInt(palabras[1])));
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
	
	static void mostrarArray() 
	{
		System.out.println(listaContactos.toString()); 
	}
	static void modifico() 
	{
		try(FileWriter fw = new FileWriter (archivo, true);
			PrintWriter pw = new PrintWriter (fw))
		{
			
			System.out.println("Nombre Nuevo");
			String nombre = entrada.next();
			System.out.println("Telefono Nuevo");
			int telefono = entrada.nextInt();
			pw.println(nombre + "," + telefono);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
