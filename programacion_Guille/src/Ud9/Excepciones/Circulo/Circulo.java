package Ud9.Excepciones.Circulo;

public class Circulo {

	private double radio;
	private double area;

	public Circulo(double num) 
	{
		this.radio = num;
	}
	public void calculoArea() throws AreaNegativaException {

		area = Math.PI * radio * radio;
		if (area > 0) {
			System.out.println("El area del circulo es: " + area);
		}
		else 
		{
			
			throw new AreaNegativaException("AREA NEGATIVA");
		}
	}

}
