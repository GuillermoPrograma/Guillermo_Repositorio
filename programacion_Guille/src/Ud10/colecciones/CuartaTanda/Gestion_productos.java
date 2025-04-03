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
		while (it.hasNext()) {
			if (it.next().getCodigo() == cod)
				it.remove();
		}
	}

	Producto obtener(int cod) {
		for(Producto p: lista) 
		{
			if(p.getCodigo() == cod)
				return p;
		}
		return null;
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

	ArrayList buscar(String tipo) {
		ArrayList<Producto> listatip = new ArrayList<>();
		for (Producto p : lista) {
			if (p.getTipo().equals(tipo)) {
				listatip.add(p);
			}
		}
		return listatip;
	}

	void tamanio() {
		System.out.println(lista.size());
	}

	void agregarSinDuplicados(Producto p1) throws DatosExcepcion {
		for (Producto p2 : lista) {
			if (p1.getCodigo() == p2.getCodigo()) {
				if (!p1.getNombre().equals(p2.getNombre())
					&& !p1.getTipo().equals(p2.getTipo()))
					throw new DatosExcepcion("producto erroneo");
				
				else if (p1.getCodigo() == p2.getCodigo() && p1.getPrecio() != p2.getPrecio()) {
					p2.setPrecio(p1.getPrecio());
					p2.setStock(p2.getStock()+p1.getStock());
					
				} else if (p1.getCodigo() == p2.getCodigo() && p1.getNombre().equals(p2.getNombre())
						&& p1.getTipo().equals(p2.getTipo()) && p1.getPrecio() == p2.getPrecio())
					p2.setStock(p2.getStock() + p1.getStock());
			}
		}
		if(!lista.contains(p1))
			lista.add(p1);
	}

	void aumentarPrecio(String tipo, double porcentaje) {
		for (Producto p : lista) {
			if (p.getTipo().equals(tipo)) {
				p.setPrecio(p.getPrecio() + p.getPrecio() * porcentaje / 100);
			}
		}
	}

	void eliminarSinStock() {
		for (Producto p : lista) {
			if (p.getStock() == 0) {
				lista.remove(p);
			}
		}
	}
}
