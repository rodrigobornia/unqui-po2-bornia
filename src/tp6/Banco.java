package tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes ;
	private List<SolicitudDeCredito> solicitudes;
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<SolicitudDeCredito> getSolicitudes() {
		return solicitudes;
	}
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
	}
	
	//Agregar nuevos clientes al banco
	public void agregarCliente(Cliente cliente) {
		this.getClientes().add(cliente);
	}
	//Agregar nuevas solicitudes de crédito al banco
	public void agregarSolicitud(SolicitudDeCredito solicitud) {
		if(solicitud.esAceptable()) {
			this.getSolicitudes().add(solicitud);
		}
	}
/*Calcular el monto total de dinero a desembolsar por el banco, lo cual se obtiene
	como la sumatoria del monto solicitado de todas las solicitudes de crédito
	registradas que sean aceptables	*/
	public Double montoTotal() {
		Double total = this.getSolicitudes().stream().mapToDouble(SolicitudDeCredito::getMontoSolicitado).sum();
		return total;
	}
}
