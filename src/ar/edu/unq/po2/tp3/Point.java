package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.setXY(x, y);
	}
	
	public Point() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	public void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Point sumaDePoints(Point primerPoint, Point segundoPoint) {
		return new Point(this.sumaDeCoordenadaXDe_Y_(primerPoint,segundoPoint),this.sumaDeCoordenadaYDe_Y_(primerPoint,segundoPoint));
	}
	
	public int sumaDeCoordenadaXDe_Y_(Point primerPoint,Point segundoPoint) {
		return primerPoint.getX() + segundoPoint.getX();
	}
	public int sumaDeCoordenadaYDe_Y_(Point primerPoint,Point segundoPoint) {
		return primerPoint.getY() + segundoPoint.getY();
	}
}
