package tp4;

import java.time.LocalDate;

public class IngresoPorHorasExtras extends Ingreso{

	private int horasExtra;
	
	public IngresoPorHorasExtras(LocalDate mesDePercepcion, String concepto, Double montoPercibido, int horasExtra) {
		super(mesDePercepcion, concepto, montoPercibido);
		this.horasExtra = horasExtra;
	}
	
	public Double montoImponible() {
		return 0d;
	}
}