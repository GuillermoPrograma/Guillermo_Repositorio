package ProgramacionHerencias.Baraja_avanzada;

public class BarajaFrancesa extends Baraja {


	public BarajaFrancesa() {
		super(52);
		crearBaraja();
	}

	public void crearBaraja() {
		Carta Monton[] = new Carta[52];
		 Carta dadaFrancesa[] = new Carta[52];
		int contador = 0;
		for (int i = 0; i <= 3; i++) { 
			for (int j = 0; j < 13; j++) { //está mal el Carta.getNumCarta porque es un statico y al hacer dos barajas empiezo con errores del lenght
				if (i == 0) {
					
						dadaFrancesa[contador] = new Carta(j + 1, PalosBarFrancesa.Corazones);
						contador++;
				}
				if (i == 1) {
					
						dadaFrancesa[contador] = new Carta(j + 1, PalosBarFrancesa.Diamantes);
						contador++;
				}
				if (i == 2) {
					
						dadaFrancesa[contador] = new Carta(j + 1, PalosBarFrancesa.Picas);
						contador++;
				}
				if (i == 3) {
					
						dadaFrancesa[contador] = new Carta(j + 1, PalosBarFrancesa.Treboles);
						contador++;
				}

			}
			this.setMonton(Monton);
			this.setDadas(dadaFrancesa);}
	}
	
	public boolean CartaRoja(Carta c) 
	{
		boolean rojo = false;
		if(c.getPaloFrances() ==PalosBarFrancesa.Corazones || c.getPaloFrances() ==PalosBarFrancesa.Diamantes ) 
		{
			rojo = true;	
		}
		return rojo;
		
	}
	public boolean CartaNegra(Carta c) 
	{
		boolean negro = false;
		if(c.getPaloFrances() ==PalosBarFrancesa.Treboles || c.getPaloFrances() ==PalosBarFrancesa.Picas ) 
		{
			negro = true;	
		}
		return negro;
		
	}
	
}
