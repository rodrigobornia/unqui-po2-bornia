package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {
	Point o;
	Point v;
	
	@BeforeEach
	void setUp() throws Exception {
		o = new Point();
		v = new Point(2, 4);
	}
	
	
	
	
	@Test
	void createDefaultPointTest() {
		assertEquals(0, o.getX());
		assertEquals(0, o.getY());
	}
	@Test
	void createPointTest() {
		assertEquals(2, v.getX());
		assertEquals(4, v.getY());
	}
	
	
}
