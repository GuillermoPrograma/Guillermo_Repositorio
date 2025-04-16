package Entrega_Autopista;


import java.util.ArrayList;
import java.util.List;

public class Gestion_Autopista {
	static int tiempoTotal = 1000; // Los segundos en una semana son tan altos que el programa tarda una barbaridad en llegar
									// por lo menos desde mi ordenador, en vez de los 604.800, he decidido poner 1000 para que vaya rápido
									//aun asi, se puede comprobar unicamente cambiando el tiempoTotal
	static int intervaloLlegadaVehiculo = 5; // Segundos tarda cada Vehiculo en llegar
	static int tiempoActual = 0;
	static List<Terminal> listaTerminal = new ArrayList();

	public static void main(String[] args) {

		gestionAutopista(); // Una vez tenemos las listas, empiezo con el Excel

		for(Terminal t: listaTerminal) 
		{
			t.contadoDeDatos(); //Vemos ya el resultado final con sus datos!!
		}

	}

	private static void gestionAutopista() {
		Terminal tMenorCola = null;
		boolean asignado = false;
		listaTerminal.add(new Terminal(Tipo.camiones));
		listaTerminal.add(new Terminal(Tipo.autobuses));
		for (int i = 0; i < 5; i++) {
			listaTerminal.add(new Terminal(Tipo.ambos));
		}
	
		while (tiempoActual < tiempoTotal) { //Se van sumando segundos hasta que pase una semana
			Vehiculo v = vehiculoLlega();
			int menorCola = 999;
			for (Terminal t : listaTerminal) {
				if (t != null)
					t.sumamosContador();
			}
			for (Terminal t : listaTerminal) { //Para ver cual es la menor cola 

				if (t.getTipo() == Tipo.autobuses && v.getTipo() == Tipo.autobuses
						|| t.getTipo() == Tipo.camiones && v.getTipo() == Tipo.camiones) {
					t.añadirVehiculoCola(v);
					asignado = true;
					break;
				} else {
					if (menorCola > t.getListaPendiente().size() && t.getTipo() != Tipo.autobuses
							&& t.getTipo() != Tipo.camiones) {
						menorCola = t.getListaPendiente().size();
						tMenorCola = t;
					}

				}
			}
			if (tMenorCola != null && asignado == false) {
				tMenorCola.añadirVehiculoCola(v);
			}
			
			asignado = false;
		}
		
	}

	private static Vehiculo vehiculoLlega() {

		tiempoActual += intervaloLlegadaVehiculo;
		System.out.println(tiempoActual); //He dejado este syso como un contador del tiempo que
										//falta hasta que de los resultados, cuando llegue a ser el TiempoTotal los da
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
