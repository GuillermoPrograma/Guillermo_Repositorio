package IV_EjercicioRepaso;

public class TelefonoMovil extends Productos_Electronicos {
	private boolean volador = false;
	TelefonoMovil(String marca, String modelo, double precio, String compañia) {
		super(marca, modelo, precio);
		this.compañia = compañia;
		
		if(this.getModelo().startsWith("pro")) 
		{
			this.volador = true;
		}
	}

	String compañia;
	public void volar() throws voladorException 
	{		
		if(this.volador == false) 
		{
			throw new voladorException("Telefono móvil" + this.getModelo() + "no puede volar en este momento");
		}	
		else 
		{
			System.out.println("El telefono móvil" + this.getModelo() + "está volando");
		}
		
	}
}
