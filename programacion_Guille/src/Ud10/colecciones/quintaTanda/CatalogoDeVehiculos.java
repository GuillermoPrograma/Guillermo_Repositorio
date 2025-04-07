package Ud10.colecciones.quintaTanda;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeVehiculos {
	
	List <Vehiculos> lista = new ArrayList<>();
	
	void registrarVehiculos(Vehiculos v) throws alquilerException 
	{
		v.alquilarVehiculo();
		
	}
	
}
