package ProgramacionHerencias.Universidad;

public class Probamos {
public static void main(String[] args) {
	
	Asociado prueba1 = new Asociado("Guille","Garcia",22,"EO22","22012015",1500,20,10);
	Catedratico catedratico = new Catedratico("Paco","Jurado",50,"EO21","09022002",2000,300,"090202");
	System.out.println(prueba1.altaProfesor());
	prueba1.calculaAntiguedad();
	System.out.println(catedratico.altaProfesor());
	catedratico.calculaAntiguedad();
	
}
}
