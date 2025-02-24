package ProgramacionHerencias.Baraja_avanzada;

public class BarajaFrancesa extends Baraja {


	public BarajaFrancesa() {
		super(52);

	}

	public void crearBaraja() {
		
		 Carta dadaFrancesa[] = new Carta[52];
		
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 9; j++) {
				if (i == 0) {
					if (j > 6) {
						dadaFrancesa[Carta.getNumCarta()] = new Carta(j + 3, PalosBarFrancesa.Corazones);
					} else
						dadaFrancesa[Carta.getNumCarta()] = new Carta(j + 1, PalosBarFrancesa.Corazones);
				}
				if (i == 1) {
					if (j > 6) {
						dadaFrancesa[Carta.getNumCarta()] = new Carta(j + 3, PalosBarFrancesa.Diamantes);
					} else
						dadaFrancesa[Carta.getNumCarta()] = new Carta(j + 1, PalosBarFrancesa.Diamantes);
				}
				if (i == 2) {
					if (j > 6) {
						dadaFrancesa[Carta.getNumCarta()] = new Carta(j + 3, PalosBarFrancesa.Picas);
					} else
						dadaFrancesa[Carta.getNumCarta()] = new Carta(j + 1, PalosBarFrancesa.Picas);
				}
				if (i == 3) {
					if (j > 6) {
						dadaFrancesa[Carta.getNumCarta()] = new Carta(j + 3, PalosBarFrancesa.Treboles);
					} else
						dadaFrancesa[Carta.getNumCarta()] = new Carta(j + 1, PalosBarFrancesa.Treboles);
				}

			}
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
