package tpAdapterTemplate.ej2;

public class EmpleadoPasante extends Empleado{

	@Override
	protected int pagoExtra() {
		return 0;
	}
	
	@Override
	protected int sueldoBasico() {
		return 0;
	}
	
	@Override
	protected int montoPorHoraTrabajada() {
		return 40;
	}
}
