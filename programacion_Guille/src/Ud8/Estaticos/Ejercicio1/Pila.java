package Ud8.Estaticos.Ejercicio1;

public class Pila implements ColeccionInterfaz {

	public Object[] pila = new Object[9];
	private int contadorObjeto = 0;

	public boolean estaVacia() {
		boolean vacia = true;
		for (int i = 0; i < pila.length; i++) {
			if (pila[i] != null)
				vacia = false;
		}

		return vacia;
	}

	public Object extraer() {
		Object objetoPila;
		objetoPila = pila[0];
		pila[0] = null;
		contadorObjeto--;

		// -------------------------

		Object pilaClon[] = new Object[pila.length - 1];
		for (int i = 0; i < pilaClon.length; i++) {

			pilaClon[i] = pila[i + 1];

		}

		pila = pilaClon;
		return objetoPila;

	}

	public Object primero() {
		return pila[0];

	}

	public boolean aniadir(Object objeto) {
		if (this.pila.length > contadorObjeto) {
			this.pila[contadorObjeto] = objeto;
			contadorObjeto++;
			return true;
		}
		return false;

	}

	public Object[] getPila() {
		return pila;
	}

	public void setPila(Object[] pila) {
		this.pila = pila;
	}

	public int getContadorObjeto() {
		return contadorObjeto;
	}

	public void setContadorObjeto(int contadorObjeto) {
		this.contadorObjeto = contadorObjeto;
	}

}
