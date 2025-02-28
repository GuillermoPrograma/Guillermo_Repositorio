package ProgramacionHerencias.Universidad;

import java.time.LocalDateTime;

public class Catedratico extends Profesor {

	private String fechaOposicion;
	private int idCatedratico;

	Catedratico() {
		super();
		this.fechaOposicion = "";
		this.idCatedratico = 0;
	}

	Catedratico(String nombre, String apellido, int edad, String ideProfesor, String fechaAlta, int salarioBruto,
			double irpf, String fechaOposicion) {
		super(nombre, apellido, edad, ideProfesor, fechaAlta, salarioBruto, irpf);
		this.fechaOposicion = fechaOposicion;
		this.idCatedratico = (int) (1 + Math.random() * (100 - 1 + 1));
	}

	public String altaProfesor() {
		LocalDateTime hoy = LocalDateTime.now();
		String año = fechaOposicion.substring(4);
		int añosCotizados = hoy.getYear() - Integer.parseInt(año);
		double plusAntiguedad;
		if (añosCotizados > 3 || añosCotizados < 5) {
			plusAntiguedad = this.getSalarioBruto() * 0.05;
			return "El Salario de este catedrático es de " + (plusAntiguedad + this.getSalarioBruto()) + " euros";
		}
		if (añosCotizados > 5 || añosCotizados < 10) {
			plusAntiguedad = this.getSalarioBruto() * 0.15;
			return "El Salario de este catedrático es de " + (plusAntiguedad + this.getSalarioBruto()) + " euros";
		}
		if (añosCotizados < 25) {
			plusAntiguedad = this.getSalarioBruto() * 0.25;
			return "El Salario de este catedrático es de " + (plusAntiguedad + this.getSalarioBruto()) + " euros";
		} else
			return "El Salario de este catedrático es de " + this.getSalarioBruto() + " euros";
	}

	public String getFechaOposicion() {
		return fechaOposicion;
	}

	public void setFechaOposicion(String fechaOposicion) {
		this.fechaOposicion = fechaOposicion;
	}

	public int getIdCatedratico() {
		return idCatedratico;
	}

	@Override
	public String toString() {
		super.toString();
		return "Catedratico [fechaOposicion=" + fechaOposicion + ", idCatedratico=" + idCatedratico + "]";
	}
	

}
