package Ud5.RuletaRusa;

public class Revolver {
	int posicionTambor;
	int posicionBala;
	
	Revolver()
	{
		posicionTambor = (int) (1 + Math.random() * (6 - 1 + 1));
		posicionBala = (int) (1 + Math.random() * (6 - 1 + 1));	
	}
	public boolean disparar()
	{
		boolean disparo = false;
		if(posicionTambor == posicionBala)
			disparo = true;
			return disparo;
	}
	public void siguienteBala()
	{
		posicionBala = (int) (1 + Math.random() * (6 - 1 + 1));		
	}
	@Override
	public String toString() {
		return "Revolver [posicionTambor=" + posicionTambor + ", posicionBala=" + posicionBala + "]";
	}
	
}
