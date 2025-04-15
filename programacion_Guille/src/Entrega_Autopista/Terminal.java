package Entrega_Autopista;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
	private static int numRef;
	private int numTerminal;
	private Tipo tipo;
	private List<Vehiculo> listaPendiente = new ArrayList<>();
	private List<Vehiculo> listaCobrado = new ArrayList<>();// Hago dos listas, porque no se van a cobrar todos cuando
									// pase la semana
	private int contador = 0;
	

	Terminal(Tipo tipo) {
		if (numRef == 0) // No quiero que haya una terminal 0, se me hace raro en algo práctico
		{
			numRef = 1;
		} else {
			numRef++;
		}
		this.numTerminal = numRef;
		this.tipo = tipo;
	}

	void añadirVehiculoCola(Vehiculo v) {
		listaPendiente.add(v);
	}
	
	private void cobrarVehiculo() {
		
		Vehiculo v = listaPendiente.remove(0);
		listaCobrado.add(v);
		contador = 0;
		
	}

	public void sumamosContador() {
		if(cobrando() == true) 
		{
			this.contador++;
			if (this.contador == 5) {
				cobrarVehiculo();
			}
		}
	
	}
	public boolean cobrando() 
	{
		return !listaPendiente.isEmpty(); //si no está vacía está cobrando
	}
	public void prueba() 
	{
		
		System.out.println(listaCobrado);
	}

	

	public int getNumTerminal() {
		return numTerminal;
	}

	public void setNumTerminal(int numTerminal) {
		this.numTerminal = numTerminal;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public List<Vehiculo> getListaPendiente() {
		return listaPendiente;
	}

	public void setListaPendiente(List<Vehiculo> listaPendiente) {
		this.listaPendiente = listaPendiente;
	}

	public List<Vehiculo> getListaCobrado() {
		return listaCobrado;
	}

	public void setListaCobrado(List<Vehiculo> listaCobrado) {
		this.listaCobrado = listaCobrado;
	}

	@Override
	public String toString() {
		return "Terminal "+ numTerminal + "[tipo=" + tipo + ", listaPendiente=" + listaPendiente + ", listaCobrado=" + listaCobrado + "]";
	}

}
