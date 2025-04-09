package Ud10.colecciones.ColeccionDeDatos.SegundaTanda;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2_Listas {

	List<String> lista = new ArrayList<>();
	
	
	
	void agregarNombresEstudiantes(String nombre) 
	{
		lista.add(nombre);
	}
	void insertarPosicionEspecifica(int posicion, String nombre) 
	{
		lista.add(posicion, nombre);
	}
	void modificarNombreEstudiante(int indice, String nombre) 
	{
		lista.set(indice, nombre);
	}
	void eliminar() 
	{
		
	}
}
