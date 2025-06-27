package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {
	@Test
	void testComputeArea() {
		Point p = new Point(2.4, 3.8);
		Circle c = new Circle(p, 5);
		assertEquals(c.computeArea(), Math.PI*5*5);
	}
	
	@Test
	void testComputeArea1() {
		Point p = new Point(0, 0);
		Circle c = new Circle(p, 0);
		assertEquals(c.computeArea(), 0);
	}
	
	@Test
	void testComputeCircumference() {
		Point p = new Point(9, 3.4);
		Circle c = new Circle(p, 5);
		assertEquals(c.computeCircumference(), Math.PI*5*2);
	}
	
	@Test
	void testComputeCircumference1() {
		Point p = new Point(9, 3.4);
		Circle c = new Circle(p, 0);
		assertEquals(c.computeCircumference(), 0);
	}
	
	@Test
	void testComputeArcLength() {
		Point p = new Point(9, 3.4);
		Circle c = new Circle(p, 4);
		assertEquals(c.computeArcLength(2), 8);
	}
	
	@Test
    void testComputeArea_ZeroRadius() {
        Circle c = new Circle(new Point(0, 0), 0);
        assertEquals(0.0, c.computeArea(), 0);
    }

    @Test
    void testComputeArea_NegativeRadius() {
        Circle c = new Circle(new Point(0, 0), -5);
        assertEquals(0.0, c.computeArea(), 1e-9);
    }



}
