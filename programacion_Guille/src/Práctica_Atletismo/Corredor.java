package Práctica_Atletismo;

import java.util.ArrayList;
import java.util.List;

public class Corredor implements Participante {

	private String nombre;
	private int edad;
	private Categoria categoria;
	private List<Medalla> listaMedallas = new ArrayList<>();

	Corredor(String nombre, int edad) throws edadExcepcion {
		this.nombre = nombre;
		this.edad = edad;
		if (this.edad > 8 && this.edad < 14) {
			this.categoria = Categoria.infantil;
		} else if (this.edad >= 15) {
			this.categoria = Categoria.adulto;
		} else {
			throw new edadExcepcion("Edad no Valida para ser corredor");
		}
	}

	public void inscribirseEnCarrera(Carrera carrera) throws CarreraNoPerdimitidaException {
		if (carrera.getCategoria().equals(this.categoria)) {
			carrera.agregarCorredor(this);
		} else
			throw new CarreraNoPerdimitidaException("La carrera es de otra Categoría");
	}

	public void competir(Carrera carrera, Medalla medallaresultado) throws CorredorNoCorreAquiException {
		boolean encontrado = false;
		for (Corredor j : carrera.getListaCorredores()) {
			if (j.equals(this)) {
				carrera.agregarResultado(j, medallaresultado);
				encontrado = true;
			}
		}
		if (encontrado == false) {
			throw new CorredorNoCorreAquiException("El corredor no se encuentra en esta carrera");
		}

	}

	public void mostrar() {
		System.out.println(
				this.nombre + this.edad);
		System.out.println(this.listaMedallas);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Medalla> getListaMedallas() {
		return listaMedallas;
	}

	public void setListaMedallas(List<Medalla> listaMedallas) {
		this.listaMedallas = listaMedallas;
	}

}
