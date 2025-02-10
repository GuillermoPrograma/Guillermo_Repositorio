package ProgramacionHerencias.Electrodomesticos;

public class Electrodomestico {

	
	private  double precioBase;
	private  Color color;
	private ConsumoEnergetico consum;
	private  double peso;
	private  final Color COLOR_DEFECTO = Color.Blanco;
	private  final ConsumoEnergetico CONSUM_DEFECTO =ConsumoEnergetico.F;
	private  final int PRECIOBASE_DEFECTO = 100;
	private final int PESO_DEFECTO = 5;
	private  int precioFinal = PRECIOBASE_DEFECTO;
	 Electrodomestico()
	 {
		 color = COLOR_DEFECTO;
		 consum = CONSUM_DEFECTO;
		 precioBase = PRECIOBASE_DEFECTO;
		 peso = PESO_DEFECTO;
	 }
	 Electrodomestico(double precioBase, double peso)
	 {
		 this.precioBase = precioBase;
		 this.peso = peso;
		 color = COLOR_DEFECTO;
		 consum = CONSUM_DEFECTO;
	 }
	 Electrodomestico(double precioBase, double peso,Color color, ConsumoEnergetico consum)
	 {
		 this.precioBase = precioBase;
		 this.peso = peso;
		 this.color = color;
		 this.consum = consum;
	 }
	 
	public void precioFinal()
	{
		switch(this.consum) {
		
		case A:
			precioFinal += 100;
			break;
		case B:
			precioFinal += 80;
			break;
		case C:
			precioFinal += 60;
			break;
		case D:
			precioFinal += 50;
			break;
		case E:
			precioFinal += 30;
			break;
		case F:
			precioFinal += 10;
		
		}
		
		if(this.peso > 0 && this.peso <= 19) 
		{
			precioFinal += 10;
		}
		else if(this.peso > 20 && this.peso <= 49) 
		{
			precioFinal += 50;	
		}
		else if(this.peso > 50 && this.peso <= 79) 
		{
			precioFinal += 80;	
		}
		else if(this.peso > 80) 
		{
			precioFinal += 100;	
		}
		
		precioBase = precioFinal;
	}	 
	 
	 
	 
	 
	 
	 
	public double getPrecioBase() {
		return precioBase;
	}
	public Color getColor() {
		return color;
	}
	public ConsumoEnergetico getConsum() {
		return consum;
	}
	public double getPeso() {
		return peso;
	}
	public Color getCOLOR_DEFECTO() {
		return COLOR_DEFECTO;
	}
	public ConsumoEnergetico getCONSUM_DEFECTO() {
		return CONSUM_DEFECTO;
	}
	public int getPRECIOBASE_DEFECTO() {
		return PRECIOBASE_DEFECTO;
	}
	public int getPESO_DEFECTO() {
		return PESO_DEFECTO;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

}
