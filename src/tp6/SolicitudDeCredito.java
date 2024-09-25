package tp6;

public abstract class SolicitudDeCredito {
	public Cliente cliente;
	public Double  montoSolicitado;
	public int plazo;
	
	
	public Double montoCuotaMensual() {
		return this.getMontoSolicitado() / this.getPlazo();
	}
	//CHEQUEO
	public abstract Boolean esAceptable();
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Double getMontoSolicitado() {
		return montoSolicitado;
	}
	public void setMontoSolicitado(Double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}	;
}
