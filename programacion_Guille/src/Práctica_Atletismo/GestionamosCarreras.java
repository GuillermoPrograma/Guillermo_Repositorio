package Práctica_Atletismo;

public class GestionamosCarreras {

	public static void main(String[] args) {

		try {
			Carrera c1 = new Carrera("CarreraProfesional", Categoria.adulto);
			Carrera c2 = new Carrera("CarreraJoven", Categoria.infantil);
			Corredor corredor1 = new Corredor("Julio", 16);
			Corredor corredor2 = new Corredor("Alba", 9);
			Corredor corredor3 = new Corredor("Julian", 10);
			Medalla medalla1 = new Medalla(Tipo.oro, c1);
			Medalla medalla2 = new Medalla(Tipo.bronce, c2);

			corredor1.inscribirseEnCarrera(c1);
			corredor1.competir(c1, medalla1);
			corredor2.inscribirseEnCarrera(c2);
		    corredor2.competir(c2, medalla2);
		    corredor1.mostrar();
			
		} catch (edadExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CarreraNoPerdimitidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CorredorNoCorreAquiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
