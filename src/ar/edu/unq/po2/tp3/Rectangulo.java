package ar.edu.unq.po2.tp3;


public class Rectangulo {
	private Punto dimension;
	

	public Rectangulo(int x,int y) {
		super();
		this.dimension = new Punto(x,y);
	}
	
	public int coordenadaY() {
		return dimension.getY();
	}

	public int coordenadaX() {
		return dimension.getX();
	}
	
	//

	public int area() {
		return this.coordenadaX() * this.coordenadaY();
	}
	//
	public int perimetro() {
		return (dimension.getX() * 2) + (dimension.getY() * 2) ;
	}
	
	//
	public void moverPosicionesDeX(int cantDePosiciones) {
		dimension.setX(this.coordenadaX() + cantDePosiciones);
	}
	public void moverPosicionesDeY(int cantDePosiciones) {
		dimension.setY(this.coordenadaY() + cantDePosiciones);
	}
}