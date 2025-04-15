package Entrega_Autopista;

import java.util.ArrayList;
import java.util.List;

public class Gestion_Autopista {
	static int tiempoTotal = 604800; // Segundos en una semana
	static int intervaloLlegadaVehiculo = 5; // Segundos tarda cada Vehiculo en llegar
	static int tiempoActual = 0;
	static List<Terminal> listaTerminal = new ArrayList();

	public static void main(String[] args) {
		Terminal tMenorCola = null;
		int minCola = 999;
		listaTerminal.add(new Terminal(Tipo.camiones));
		listaTerminal.add(new Terminal(Tipo.autobuses));
		for (int i = 0; i < 5; i++) {
			listaTerminal.add(new Terminal(Tipo.ambos));
		}

		while (tiempoActual != tiempoTotal) {
			Vehiculo v = vehiculoLlega();
			int menorCola = 999;
			
			for (Terminal t : listaTerminal) {

				if (t.getTipo() == Tipo.autobuses && v.getTipo() == Tipo.autobuses
						|| v.getTipo() == Tipo.camiones && t.getTipo() == Tipo.camiones) {
					t.añadirVehiculoCola(v);
					break;
				} else {
					if(menorCola > t.getListaPendiente().size()) 
					{
						menorCola = t.getListaPendiente().size();
						tMenorCola = t;
					}
					

					}
				}
			if(tMenorCola != null) 
			{
				tMenorCola.añadirVehiculoCola(v);
			}
			}
			
			for (Terminal t2 : listaTerminal) {
				System.out.println(t2);
				System.out.println("terminal");
			}
		}
	

	private static Vehiculo vehiculoLlega() {

		tiempoActual += intervaloLlegadaVehiculo;

		int numPorcentaje = (int) (1 + Math.random() * (100 - 1 + 1));

		if (numPorcentaje <= 20) // 20%
		{
			return new Vehiculo(Tipo.camiones, tiempoActual);
		}
		if (numPorcentaje > 20 && numPorcentaje < 30) // 10 %
		{
			return new Vehiculo(Tipo.autobuses, tiempoActual);
		}
		if (numPorcentaje > 30 && numPorcentaje < 35) // 5 %
		{
			return new Vehiculo(Tipo.motos, tiempoActual);
		} else
			return new Vehiculo(Tipo.coches, tiempoActual);// 65%

	}

}
