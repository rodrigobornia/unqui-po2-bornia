package ar.edu.unq.po2.tp3;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;

	public Persona(String nombre, java.util.Date date) {
		this.nombre = nombre;
		this.fechaNacimiento = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public Persona(String string, LocalDate nacimientoFranco, int i) {
		// TODO Auto-generated constructor stub
	}

	public Persona(String string, LocalDate nacimientoFranco, int i) {
		// TODO Auto-generated constructor stub
	}

	public int edad() {
		return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
	}

	public boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();
	}

	public String nombre() {
		return this.nombre;
	}
}
