package ProgramacionHerencias.Electrodomesticos;

public class Television extends Electrodomestico {

	private double resolucion;
	private boolean TDT = false;
	
	Television()
	{
		super();
	}
	Television(double precioBase, double peso)
	{
		super(precioBase,peso);
		
		
	}
	Television(double precioBase, double peso,Color color, ConsumoEnergetico consum, double resolucion, boolean TDT)
	{
		super(precioBase,peso,color,consum);
		this.TDT = TDT;
		this.resolucion = resolucion;
	}
	
	
	@Override
	public void precioFinal() {
		// TODO Auto-generated method stub
		super.precioFinal();
		if(resolucion > 40) 
		{
			
			this.setPrecioBase(super.getPrecioBase()+(super.getPrecioBase()/100)*30);
		}
		if(TDT ==true) 
		{
			this.setPrecioBase(super.getPrecioBase() + 50);
		}
	}
	
	
	
	
	
	
	
	public double getResolucion() {
		return resolucion;
	}
	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isTDT() {
		return TDT;
	}
	public void setTDT(boolean tDT) {
		TDT = tDT;
	}
	
	
	
}
