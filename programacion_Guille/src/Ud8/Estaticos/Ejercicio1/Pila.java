package Ud8.Estaticos.Ejercicio1;

public class Pila implements ColeccionInterfaz {

	public Object[] pila = new Object[10];
	
	public boolean estaVacia() 
	{
	boolean vacia= false;
		if(pila == null)
			vacia = true;
	
	return vacia;
	}
	public Object extraer() 
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
	public  boolean añadir(Object objeto) 
	{
		boolean seImplementa = false;
		if(pila[0] == null) 
		{
		Object pilaClon[] = new Object[pila.length]; 	
		for(int i = 0; i < pila.length; i++) 
		{
			if(i != pila.length - 1) 
			{
				pilaClon[i] = pila[i + 1];
			}
		}
		pila = pilaClon;
		seImplementa = true;
		}
		
		return seImplementa;
	}
	
	
}
