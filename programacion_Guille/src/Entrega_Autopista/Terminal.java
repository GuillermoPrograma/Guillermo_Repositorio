package Entrega_Autopista;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
	private static int numTerminal;
	private Tipo tipo;
	private List<Vehiculo> listaPendiente = new ArrayList<>();
	private List<Vehiculo> listaCobrado = new ArrayList<>();// Hago dos listas, porque no se van a cobrar todos cuando
									// pase la semana
	private int contador = 0;
	private boolean cobrando = false;

	Terminal(Tipo tipo) {
		if (numTerminal == 0) // No quiero que haya una terminal 0, se me hace raro en algo práctico
		{
			numTerminal = 1;
		} else {
			numTerminal++;
		}

		this.tipo = tipo;
	}

	void añadirVehiculoCola(Vehiculo v) {
		listaPendiente.add(v);

	}

	private void cobrarVehiculo(Vehiculo v) {

		listaPendiente.remove(v);
		listaCobrado.add(v);
		contador = 0;
	}

	public void sumamosContador() {
		this.contador++;
		if (this.contador == 5) {
			for (Vehiculo ve : listaPendiente) {
				cobrarVehiculo(ve);
			}
		}
	}
	public void prueba() 
	{
		
		System.out.println(listaCobrado);
	}

	public static int getNumTerminal() {
		return numTerminal;
	}

	public static void setNumTerminal(int numTerminal) {
		Terminal.numTerminal = numTerminal;
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
