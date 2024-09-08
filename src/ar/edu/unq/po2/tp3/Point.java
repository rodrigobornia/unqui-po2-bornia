package ar.edu.unq.po2.tp3;

public class Point {

	private int x ;
	private int y ;
	
	public Point(){
		this.x = 0;
		this.y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void moverPunto(int newX, int newY) {
		this.x= newX;
		this.y= newY;
	}
	public Point add(Point otroPunto) {
		return new Point(this.x + otroPunto.x, this.y + otroPunto.y);
	}

	public int x() {
		return this.x;
	}

	public int y() {
		return this.y;
	}
}
