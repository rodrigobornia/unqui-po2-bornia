package tp6;

public class Cliente {
	public String nyAp;
	public String direccion;
	public String getNyAp() {
		return nyAp;
	}

	public void setNyAp(String nyAp) {
		this.nyAp = nyAp;
	}

	public int edad;
	public Double sueldoNeto;
	public Double sueldoNetoAnual;

	public Cliente(String nyAp, String direccion, int edad, Double sueldoNeto, Double sueldoNetoAnual) {
		super();
		this.nyAp = nyAp;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNeto = sueldoNeto;
		this.sueldoNetoAnual = sueldoNetoAnual;
	}

	public Double getSueldoNeto() {
		return sueldoNeto;
	}

	public void setSueldoNeto(Double sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}

	public Double getSueldoNetoAnual() {
		return sueldoNetoAnual;
	}

	public void setSueldoNetoAnual(Double sueldoNetoAnual) {
		this.sueldoNetoAnual = sueldoNetoAnual;
	}

	public int getEdad() {
		return edad;
	}
	
	
}
