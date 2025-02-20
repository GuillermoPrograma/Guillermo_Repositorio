package Ejercicio_hotel;

public class GestionHotel {

	public static void main(String[] args) {

		Estandar e1 = new Estandar(1, true, Camas.dos);
		Estandar e2 = new Estandar(2, false, Camas.uno);
		Suite s1 = new Suite(3, 3, true);
		Suite s2 = new Suite(4, 5, false);

		Persona p1 = new Persona("05731755V", "Guillermo", "Garcia Hualde", "27/11/2001");
		Persona p2 = new Persona("09876322E", "Pilar", "Jimenez Diaz", "18/03/2003");

		Habitacion habitaciones[] = new Habitacion[4];
		habitaciones[0] = e1;
		habitaciones[1] = e2;
		habitaciones[2] = s1;
		habitaciones[3] = s2;
		System.out.println("Numero Total Habitaciones :" + Habitacion.getNumTotalHabitaciones() + "\n");
		System.out.println(e1.toString() +"\n");
		System.out.println(e2.toString()+"\n");
		
		System.out.println(s1.toString()+"\n");
		
		System.out.println(s2.toString()+"\n");

		System.out.println(e1.equals(s2));
		e1.reservar(p1);
		s2.reservar(p2);
		System.out.println();
		System.out.println();
		for (int i = 0; i < habitaciones.length; i++) {
			if (habitaciones[i] instanceof Suite) {
				System.out.print("El precio de la Suite : ");	((Suite) habitaciones[i]).calcularCosteTotal();
			} else if (habitaciones[i] instanceof Estandar) {
				System.out.print("El nombre del cliente : "); ((Estandar) habitaciones[i]).mostrarCliente();
			}
		}
	}

}
