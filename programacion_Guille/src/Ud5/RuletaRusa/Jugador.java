package Ud5.RuletaRusa;

public class Jugador {

	private static int id =  1;
	private String nombre ;
	private boolean vivo ;
	Jugador()
	{
		nombre ="Jugador" + id;
		vivo = true;
		id++;
	}
	public void disparar(Revolver r)
	{
		if(r.disparar() == true)
			this.vivo = false;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
}
