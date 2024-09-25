package tp6;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{
	 Propiedad propiedad;
	public SolicitudDeCreditoHipotecario(Cliente cliente, Double monto, int plazo, Propiedad propiedad) {
		this.setCliente(cliente);
		this.setMontoSolicitado(monto);
		this.setPlazo(plazo);
		this.propiedad = propiedad;
	}
	
	@Override
	public Boolean esAceptable() {
		return montoMenorAl50PorCiento() && montoMenorAl70PorCientoDelValorFiscal()
				&& edadAceptableParaCredito();
	}
	
	public boolean montoMenorAl50PorCiento(){
		return this.getMontoSolicitado() < this.getCliente().getSueldoNeto()*0.50;
	}
	private boolean montoMenorAl70PorCientoDelValorFiscal() {
		return this.getMontoSolicitado() < propiedad.getValorFiscal()*0.70;
	}
	private boolean edadAceptableParaCredito() {
		return this.getCliente().getEdad() < 65;
	}

}
