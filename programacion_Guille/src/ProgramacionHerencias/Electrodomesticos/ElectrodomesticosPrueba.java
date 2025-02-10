package ProgramacionHerencias.Electrodomesticos;

public class ElectrodomesticosPrueba {
public static void main(String[] args) {
	Electrodomestico[] elec = new Electrodomestico[4];
	
	Electrodomestico e1 = new Electrodomestico();
	Lavadora l1 = new Lavadora(400,30);
	Television t1 = new Television();
	Lavadora l2 = new Lavadora(50,60,Color.gris,ConsumoEnergetico.C,32);
	
	elec[0] = e1;
	elec[1] = l1;
	elec[2] = t1;
	elec[3] = l2;
	
	
	for(int i=0; i<4; i++) 
	{
		elec[i].precioFinal();
		System.out.println("Precio Final : " + elec[i].getPrecioBase());
	}
}
}
