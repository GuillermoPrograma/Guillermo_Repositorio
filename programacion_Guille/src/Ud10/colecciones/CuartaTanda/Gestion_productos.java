package Ud10.colecciones.CuartaTanda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gestion_productos {

	private List<Producto> lista = new ArrayList<>();

	void agregar(Producto pr) {
		lista.add(pr);
	}

	void eliminar(int cod) {

		Iterator<Producto> it = lista.iterator();
		while(it.hasNext()) {
			if (it.next().getCodigo() == cod)
				it.remove();
		}
	}

	void obtener(int cod) {
		System.out.println(cod);
	}

	Producto buscar(int cod) {
		boolean acierto = false;
		for (Producto p : lista) {
			if (p.getCodigo() == cod) {
				return p;
			}

		}
		return null;

	}
	
	ArrayList buscar(String tipo) 
	{
		ArrayList<Producto> listatip = new ArrayList<>();
		for (Producto p : lista){
			if(p.getTipo().equals(tipo)) 
			{
				listatip.add(p);
			}
		}
		return listatip;
	}
	
	void tamaño() 
	{
		System.out.println(lista.size());
	}
	
	void agregarSinDuplicados() 
	{
		
	}

}
