package ProgramacionHerencias.Empleados;

public class Comercial extends Empleados {

	private double comision;

	Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;

	}

	@Override
	public String toString() {
		super.toString();
		return "Comercial [comision=" + comision + "]";
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public void plus() {
		if (this.getEdad() > 30 && this.comision > 200) {

			super.setSalario(getSalario() + super.getPLUS());

		}

	}

}
