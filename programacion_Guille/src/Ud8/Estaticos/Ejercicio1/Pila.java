package Ud8.Estaticos.Ejercicio1;

public class Pila implements coleccionInterfaz {

	public Object[] pila = new Object[4];
	
	public boolean estaVacia() 
	{
	boolean vacia= true;
		if(pila == null)
			vacia = true;
	
	return vacia;
	}
	public Object Extraer() 
	{
		Object objetoPila;
		objetoPila = pila[0];
		pila[0] = null;
		return objetoPila;
		
	} 
	public Object primero() 
	{
		return pila[0];
		
		
	}
	public boolean añadir() 
	{
		
		
		
	}
	
}
