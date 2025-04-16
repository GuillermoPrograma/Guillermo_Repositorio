package Entrega_Autopista;

public class Vehiculo {
		private double coste; //Almaceno aqui lo que cuesta el vehiculo para que se guarde en la lista, no estoy convencido de si es buena praxis 
							//o, en cambio, hay que meterlo en terminal de alguna manera
		private Tipo tipo;
		private int tiempoLlegada;
		Vehiculo(Tipo tipo, int tiempoLlegada)
		{
			this.tipo = tipo;
			this.tiempoLlegada = tiempoLlegada;
			switch(tipo)
			{
			case camiones:
			coste = 9.32;
			break;
			case autobuses:
			coste = 12.62;
			break;
			case motos:
			coste = 6.61;
			break;
			case coches:
			coste = 7.51;
			break;
			}
		}

		public Tipo getTipo() {
			return tipo;
		}

		public void setTipo(Tipo tipo) {
			this.tipo = tipo;
		}

		public double getCoste() {
			return coste;
		}

		public void setCoste(double coste) {
			this.coste = coste;
		}

		public int getTiempoLlegada() {
			return tiempoLlegada;
		}

		public void setTiempoLlegada(int tiempoLlegada) {
			this.tiempoLlegada = tiempoLlegada;
		}

		@Override
		public String toString() {
			return tipo+"|"+coste+"|"+tiempoLlegada+"|";
		}

		

	
}
