package Entrega_Autopista;

public class Vehiculo {

		private Tipo tipo;
		private int tiempoLlegada;
		Vehiculo(Tipo tipo, int tiempoLlegada)
		{
			this.tipo = tipo;
			this.tiempoLlegada = tiempoLlegada;
		}

		public Tipo getTipo() {
			return tipo;
		}

		public void setTipo(Tipo tipo) {
			this.tipo = tipo;
		}

		@Override
		public String toString() {
			return "Vehiculo [tipo=" + tipo + "]";
		}

	
}
