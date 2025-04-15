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
		boolean asignado = false;
		listaTerminal.add(new Terminal(Tipo.camiones));
		listaTerminal.add(new Terminal(Tipo.autobuses));
		for (int i = 0; i < 5; i++) {
			listaTerminal.add(new Terminal(Tipo.ambos));
		}
		int contador = 0;
		while (contador < 30) {
			Vehiculo v = vehiculoLlega();
			int menorCola = 999;
			for (Terminal t : listaTerminal) 
			{
				if(t != null)
				t.sumamosContador();   
			}
			for (Terminal t : listaTerminal) {

				if (t.getTipo() == Tipo.autobuses && v.getTipo() == Tipo.autobuses 
					|| t.getTipo() == Tipo.camiones && v.getTipo() == Tipo.camiones) {
					t.añadirVehiculoCola(v);
					asignado = true;
					break;
				} else {
					if(menorCola > t.getListaPendiente().size() 
						&& t.getTipo() != Tipo.autobuses &&
						t.getTipo() != Tipo.camiones) 
					{
						menorCola = t.getListaPendiente().size();
						tMenorCola = t;
					}
					

					}
				}
			if(tMenorCola != null && asignado == false) 
			{
				tMenorCola.añadirVehiculoCola(v);
			}
			contador++;
			asignado = false;
			}
			
			for (Terminal t2 : listaTerminal) {
				System.out.println(t2);
				
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
