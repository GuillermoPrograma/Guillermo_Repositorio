package Ud10.colecciones.CuartaTanda;

public class Gestionamos {
	public static void main(String[] args) {
		Gestion_productos lista = new Gestion_productos();
		Producto pr = new Producto(1, "jamon", "Serrano", 5, 200);
		Producto pr2 = new Producto(2, "Queso", "Azul", 4, 200);
		Producto pr3 = new Producto(2, "Queso", "Azul", 4, 200);
		lista.agregar(pr);
		lista.agregar(pr2);
		try {
			lista.agregarSinDuplicados(pr3);
		} catch (DatosExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		lista.tamanio();
	}
}
