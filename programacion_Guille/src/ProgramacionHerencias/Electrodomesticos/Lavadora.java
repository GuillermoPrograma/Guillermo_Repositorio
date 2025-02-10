package ProgramacionHerencias.Electrodomesticos;

public class Lavadora extends Electrodomestico{

	private int carga;
	private final int CARGA_DEFECTO = 5;
	Lavadora()
	{
		super();
		this.carga = CARGA_DEFECTO;
	}
	
	Lavadora(double precioBase, double peso)
	{
		super(precioBase,peso);
		 this.carga = CARGA_DEFECTO;
	}
	Lavadora( double precioBase, double peso,Color color, ConsumoEnergetico consum, int carga )
	{
		super(precioBase,peso,color,consum);
		this.carga = carga;
		
	}

	@Override
	public void precioFinal() {
		// TODO Auto-generated method stub
		super.precioFinal();
		if(this.carga > 30) 
		{
		this.setPrecioBase(super.getPrecioBase() + 50);
		}
	}
	
	
	
	
	
	
	
	public int getCarga() {
		return carga;
	}
	
	
	
	
	
	
	
}


