package tp6;

public class SolicitudCreditoPersonal extends SolicitudDeCredito{

	public SolicitudCreditoPersonal(Cliente cliente, Double montoSolicitado, int plazo) {
		this.setCliente(cliente);
		this.setMontoSolicitado(montoSolicitado);
		this.setPlazo(plazo);
	}
	
	@Override
	public Boolean esAceptable() {
		return netoMensualMayorA15000() && this.montoMenorAl70PorCientoDeIngresos();
	}
	private boolean netoMensualMayorA15000() {
		return this.getCliente().getSueldoNetoAnual() >= 15000;
	}

	public Boolean montoMenorAl70PorCientoDeIngresos() {
		return this.getMontoSolicitado() < (this.getCliente().getSueldoNetoAnual())*0.70;
	}
}
