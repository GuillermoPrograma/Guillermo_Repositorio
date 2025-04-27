package IV_EjercicioRepaso;

public class GestionamosMovil {
public static void main(String[] args) {

	TelefonoMovil tel1 = new TelefonoMovil("protected xs", "propro",200,"Samsung");
	TelefonoMovil tel2 = new TelefonoMovil("protected xs", "pire",20,"Samsung");
	
	try {
		tel1.volar();
		tel2.volar();
	} catch (voladorException e) {
		// TODO Auto-generated catch block
		System.err.println(e.getMessage());
	}
	
}
	
}
