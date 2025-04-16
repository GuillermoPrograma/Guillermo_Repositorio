package Entrega_Autopista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

		Vehiculo v = listaPendiente.remove(0); // creo puntero del vehiculo
		listaCobrado.add(v); // lo añado
		contador = 0;
		añadirVehiculoExcel();

	}

	public void sumamosContador() {
		if (cobrando() == true) {
			this.contador++;
			if (this.contador == 5) { // Si pasan 5 vehiculos han pasado 30 segundos(es mi manejo del tiempo)
				cobrarVehiculo();
			}
		}

	}

	public boolean cobrando() {
		return !listaPendiente.isEmpty(); // si no está vacía está cobrando
	}

	private void añadirVehiculoExcel() { // Esta funcion sirve para los vehiculos ya cobrados,
											// no le veo sentido poner como cobrados a los vehiculos en cola
		 File archivo = new File("GestionTerminal" + this.numTerminal + ".csv");
		try (FileWriter fw = new FileWriter(archivo, true);
				PrintWriter pw = new PrintWriter(fw);
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);) {

			if (br.readLine() == null) // No tiene primera linea
			{
				pw.println("Tipo de vehiculo|coste|tiempo de llegada");
			} else {
				for (Vehiculo v : listaCobrado) {
					String[] linea = v.toString().split("\\|");
					pw.println(linea[0] + "|" + linea[1] + "|" + linea[2] + "|"); // siempre van a tener las mismas
																					// particiones
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void contadoDeDatos() {

		try (FileReader fr = new FileReader("GestionTerminal" + this.numTerminal + ".csv"); //No puedo poner el file fuera del metodo anterior, me crea solo un excel
			BufferedReader br = new BufferedReader(fr);) {
			String linea;
			int contadorVehiculos = 0;
			double contadorIngreso = 0;
			double gananciasTrabajador = 0;
			br.readLine();//salto la primera linea que es el encabezado
		while((linea =br.readLine()) != null) 
		{
			
			String palabra[] =linea.split("\\|");
			 contadorVehiculos ++;
			 
			 contadorIngreso +=Double.parseDouble(palabra[1]); //la posicion del coste de los vehiculos cobrados
		}
			gananciasTrabajador = contadorIngreso * 0.02;
			
			System.out.println("Los vehiculos que han pasado por la Terminal " +this.numTerminal +" son:" + contadorVehiculos);
			System.out.println("El ingreso que han generado estos vehiculos es de la suma de :" +contadorIngreso);
			System.out.println("Las ganancias del trabajador son de :" + gananciasTrabajador);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		return "Terminal " + numTerminal + "[tipo=" + tipo + ", listaPendiente=" + listaPendiente + ", listaCobrado="
				+ listaCobrado + "]";
	}

}
