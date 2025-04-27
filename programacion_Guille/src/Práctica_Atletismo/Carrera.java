package Práctica_Atletismo;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
String nombre;
Categoria categoria;
List <Corredor> listaCorredores = new ArrayList<>();

Carrera(String nombre, Categoria categoria)
{
this.nombre = nombre;
this.categoria = categoria;
}



public void agregarCorredor(Corredor corredor)
{
listaCorredores.add(corredor);	
}
public void agregarResultado(Corredor corredor, Medalla medalla) 
{
corredor.getListaMedallas().add(medalla);

}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}

public List<Corredor> getListaCorredores() {
	return listaCorredores;
}

public void setListaCorredores(List<Corredor> listaCorredores) {
	this.listaCorredores = listaCorredores;
}



@Override
public String toString() {
	return "Carrera [nombre=" + nombre + ", categoria=" + categoria + ", listaCorredores=" + listaCorredores + "]";
}





}
