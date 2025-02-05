package ProgramacionHerencias.Electrodomesticos;

public class Electrodomestico {

	
	 double precioBase;
	 Color color;
	 ConsumoEnergetico consum;
	 double peso;
	 final Color COLOR_DEFECTO = Color.Blanco;
	 final ConsumoEnergetico CONSUM_DEFECTO =ConsumoEnergetico.F;
	 final int PRECIOBASE_DEFECTO = 100;
	 final int PESO_DEFECTO = 5;
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
}
