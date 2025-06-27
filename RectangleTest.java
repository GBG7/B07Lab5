package lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testPerimeter_case1_AxEqBx_AyEqCy() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 2); // same x as A
        Point C = new Point(3, 0); // same y as A
        Point D = new Point(3, 2);
        Rectangle r = new Rectangle(A, B, C, D);
        double expected = 2 * (A.distance(B) + A.distance(C));
        assertEquals(expected, r.perimeter(), 0.0001);
    }

    @Test
    public void testPerimeter_case2_AxEqBx_AyEqDy() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 2); // same x
        Point C = new Point(3, 1);
        Point D = new Point(3, 0); // same y
        Rectangle r = new Rectangle(A, B, C, D);
        double expected = 2 * (A.distance(B) + A.distance(D));
        assertEquals(expected, r.perimeter(), 0.0001);
    }

    @Test
    public void testPerimeter_case3_AxEqCx_AyEqBy() {
        Point A = new Point(0, 0);
        Point B = new Point(3, 0); // same y
        Point C = new Point(0, 2); // same x
        Point D = new Point(3, 2);
        Rectangle r = new Rectangle(A, B, C, D);
        double expected = 2 * (A.distance(B) + A.distance(C));
        assertEquals(expected, r.perimeter(), 0.0001);
    }

    @Test
    public void testPerimeter_case4_AxEqCx_AyEqDy() {
        Point A = new Point(0, 0);
        Point B = new Point(3, 1);
        Point C = new Point(0, 2); // same x
        Point D = new Point(3, 0); // same y
        Rectangle r = new Rectangle(A, B, C, D);
        double expected = 2 * (A.distance(C) + A.distance(D));
        assertEquals(expected, r.perimeter(), 0.0001);
    }

    @Test
    public void testPerimeter_case5_else_AyEqCy() {
        Point A = new Point(0, 0);
        Point B = new Point(3, 1);
        Point C = new Point(2, 0); // same y
        Point D = new Point(0, 2); // same x
        Rectangle r = new Rectangle(A, B, C, D);
        double expected = 2 * (A.distance(D) + A.distance(C));
        assertEquals(expected, r.perimeter(), 0.0001);
    }

    @Test
    public void testPerimeter_case6_else_AyEqBy() {
        Point A = new Point(0, 0);
        Point B = new Point(2, 0); // same y
        Point C = new Point(2, 2);
        Point D = new Point(0, 2); // same x
        Rectangle r = new Rectangle(A, B, C, D);
        double expected = 2 * (A.distance(D) + A.distance(B));
        assertEquals(expected, r.perimeter(), 0.0001);
    }
}