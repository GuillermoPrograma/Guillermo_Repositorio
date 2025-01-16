package Programacion_objeto_Ejercicio5_2.Persona2;

public class Persona2 {

	private String nombre;
	private int edad;
	private char sexo = 'H';
	private double peso;
	private double altura;
	private String dniL;
	
	public  Persona2( String dni) 
	{
		this.dniL = dni;
		
	}
	public  Persona2(String dni , String nombre) 
	{
		this.dniL = dni;
		this.nombre = nombre;
	}
	public  Persona2(String dni , String nombre , int edad, double peso, double altura, char sexo) 
	{
		this.dniL = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
		comprobarSexo(this.sexo);
	}
	
	public int CalcularImc () 
	{
			
		final int pesoIdeal = -1;
		final int debajoPesoIdeal = 0;
		final int sobrePeso = 1;
		if (this.peso/(this.altura*this.altura) < 20) 
		{
			return pesoIdeal;
		}
		else if((this.peso/(this.altura*this.altura) >= 20 && (this.peso/(this.altura*this.altura) <= 25))) 
		{
			return debajoPesoIdeal;
		}
		
		else
		{
			return sobrePeso;
		}
		
	}
	public void esMayorDeEdad() 
	{
		if(this.edad > 18)
			System.out.println("Es mayor de edad");
		else
			System.out.println("No es mayor de edad");
	}
	private void comprobarSexo(char sexo)
	{
		if(sexo == 'H')
			this.sexo = 'H';
		else if(sexo == 'M')
			this.sexo = 'M';
		else
			this.sexo = 'H';
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura="
				+ altura + ", dni=" + dniL + "]";
	}
	
	public String generaDNI()
	{
		
		String dniL ="";
		
		for(int i = 0; i <= 8; i++) 
		{
			dniL = dniL + (int) (Math.random() * (1+1));
		}
		int dni = Integer.parseInt(dniL);
		dniL =  dniL +calcularLetra(dni);
		return dniL;
	}
	
	public char calcularLetra(int dni) 
	{
		
		 char Letra[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B','N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		return Letra[dni]; 
	}
		 
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public void setSexo(char sexo) {
			this.sexo = sexo;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public void setDniL(String dniL) {
			this.dniL = dniL;
		}
	
			
		}

	
