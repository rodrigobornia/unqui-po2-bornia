package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Collection;

public class EquipoDeTrabajo {
private String nombreEquipo;
	
	private Collection<Persona> integrantes = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
	}
	
	protected Collection<Persona> getIntegrantes() {
		return integrantes;
	}
	
	public String nombreEquipo() {
		return nombreEquipo;
	}
	
	public void agregarPersona(Persona persona) {
		integrantes.add(persona);
	}
	
	public void quitarPersona(Persona persona) {
		integrantes.remove(persona);
	}

	public int promedioEdadEquipo() {
		
		int sumatoriaDeEdades = this.getIntegrantes().stream()
									 .mapToInt(persona -> persona.edad())
									 .sum();
		return sumatoriaDeEdades / integrantes.size();
	}
	
}
