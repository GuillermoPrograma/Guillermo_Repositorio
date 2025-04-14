package Entrega_Autopista;

public class Gestion_Autopista {
	int tiempoTotal = 604800; //Segundos en una semana
	 int intervaloLlegadaVehiculo = 5; //Segundos tarda cada Vehiculo en llegar
	 int tiempoActual = 0;
	public static void main(String[] args) {

		 
		 
		 
		
	}

	
	
	private Vehiculo vehiculoLlega() {
		
		tiempoActual += intervaloLlegadaVehiculo;
		
		int numPorcentaje = (int) (1 + Math.random() * (100 - 1 + 1));

		if (numPorcentaje <= 20) // 20%
		{
			return new Vehiculo(Tipo.camiones,tiempoActual);
		}
		if (numPorcentaje > 20 && numPorcentaje < 30) // 10 %
		{
			return new Vehiculo(Tipo.autobuses,tiempoActual);
		}
		if (numPorcentaje > 30 && numPorcentaje < 35) // 5 %
		{
			return new Vehiculo(Tipo.motos,tiempoActual); // 65%
		} else
			return new Vehiculo(Tipo.coches,tiempoActual);

	}

}
