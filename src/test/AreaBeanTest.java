package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.beans.AreaBean;

public class AreaBeanTest {
    AreaBean ab = new AreaBean();
    double r = 2;

    // TRIANGLE TEST
    @Test
    public void triangleBorder1() {
        assertTrue(ab.checkHit(-1, 0, r));
    }

    @Test
    public void triangleBorder2() {
        assertTrue(ab.checkHit(-0.5, 0.5, r));
    }

    @Test
    public void triangleBorder3() {
        assertTrue(ab.checkHit(0, 1, r));
    }

    @Test
    public void triangleBorder4() {
        assertTrue(ab.checkHit(-0.5, 0, r));
    }

    @Test
    public void triangleBorder5() {
        assertTrue(ab.checkHit(0, 0, r));
    }

    @Test
    public void triangleBorder6() {
        assertTrue(ab.checkHit(0, 0.5, r));
    }

    @Test
    public void triangleBorderGreen1() {
        assertTrue(ab.checkHit(-0.99, 0.01, r));
    }

    @Test
    public void triangleBorderGreen2() {
        assertTrue(ab.checkHit(-0.5, 0.49, r));
    }

    @Test
    public void triangleBorderGreen3() {
        assertTrue(ab.checkHit(-0.01, 0.98, r));
    }

    @Test
    public void triangleBorderGreen4() {
        assertTrue(ab.checkHit(-0.01, 0.5, r));
    }

    @Test
    public void triangleBorderGreen5() {
        assertTrue(ab.checkHit(-0.01, 0.01, r));
    }

    @Test
    public void triangleBorderGreen6() {
        assertTrue(ab.checkHit(-0.5, 0.01, r));
    }

    @Test
    public void triangleInside1() {
        assertTrue(ab.checkHit(-0.3, 0.2, r));
    }

    @Test
    public void triangleInside2() {
        assertTrue(ab.checkHit(-0.3, 0.4, r));
    }

    @Test
    public void triangleInside3() {
        assertTrue(ab.checkHit(-0.5, 0.25, r));
    }

    @Test
    public void triangleInside4() {
        assertTrue(ab.checkHit(-0.7, 0.2, r));
    }

    @Test
    public void triangleBorderRed1() {
        assertFalse(ab.checkHit(-1.01, -0.01, r));
    }

    @Test
    public void triangleBorderRed2() {
        assertFalse(ab.checkHit(-0.5, 0.51, r));
    }

    @Test
    public void triangleBorderRed3() {
        assertFalse(ab.checkHit(-0.01, 1.02, r));
    }

    @Test
    public void triangleBorderRed4() {
        assertFalse(ab.checkHit(-0.01, -0.01, r));
    }

    @Test
    public void triangleBorderRed5() {
        assertFalse(ab.checkHit(-0.5, -0.01, r));
    }
    // SQUARE TESTS

    @Test
    public void squareBorder1() {
        assertTrue(ab.checkHit(0, 1.75, r));
    }

    @Test
    public void squareBorder2() {
        assertTrue(ab.checkHit(0, 2, r));
    }

    @Test
    public void squareBorder3() {
        assertTrue(ab.checkHit(1, 2, r));
    }

    @Test
    public void squareBorder4() {
        assertTrue(ab.checkHit(2, 2, r));
    }

    @Test
    public void squareBorder5() {
        assertTrue(ab.checkHit(2, 1, r));
    }

    @Test
    public void squareBorder6() {
        assertTrue(ab.checkHit(2, 0, r));
    }

    @Test
    public void squareBorderGreen1() {
        assertTrue(ab.checkHit(0.01, 1.75, r));
    }

    @Test
    public void squareBorderGreen2() {
        assertTrue(ab.checkHit(0.01, 1.99, r));
    }

    @Test
    public void squareBorderGreen3() {
        assertTrue(ab.checkHit(1, 1.99, r));
    }

    @Test
    public void squareBorderGreen4() {
        assertTrue(ab.checkHit(1.99, 1.99, r));
    }

    @Test
    public void squareBorderGreen5() {
        assertTrue(ab.checkHit(1.99, 1, r));
    }

    @Test
    public void squareBorderGreen6() {
        assertTrue(ab.checkHit(1.99, 0.01, r));
    }

    @Test
    public void squareInside1() {
        assertTrue(ab.checkHit(1.75, 0.5, r));
    }

    @Test
    public void squareInside2() {
        assertTrue(ab.checkHit(0.5, 1.75, r));
    }

    @Test
    public void squareInside3() {
        assertTrue(ab.checkHit(1.75, 1.75, r));
    }

    @Test
    public void squareInside4() {
        assertTrue(ab.checkHit(1, 1, r));
    }

    @Test
    public void squareInside5() {
        assertTrue(ab.checkHit(0.5, 0.5, r));
    }

    @Test
    public void squareBorderRed1() {
        assertFalse(ab.checkHit(-0.01, 1.75, r));
    }

    @Test
    public void squareBorderRed2() {
        assertFalse(ab.checkHit(-0.01, 2.01, r));
    }

    @Test
    public void squareBorderRed3() {
        assertFalse(ab.checkHit(1, 2.01, r));
    }

    @Test
    public void squareBorderRed4() {
        assertFalse(ab.checkHit(2.01, 2.01, r));
    }

    @Test
    public void squareBorderRed5() {
        assertFalse(ab.checkHit(2.01, 1, r));
    }

    @Test
    public void squareBorderRed6() {
        assertFalse(ab.checkHit(2.01, -0.01, r));
    }

    // CIRCLE TESTS

    @Test
    public void circleBorder1() {
        assertTrue(ab.checkHit(0.5, 0, r));
    }

    @Test
    public void circleBorder2() {
        assertTrue(ab.checkHit(1, 0, r));
    }

    @Test
    public void circleBorder3() {
        assertTrue(ab.checkHit(Math.sqrt(3) / 2, -0.5, r));
    }

    @Test
    public void circleBorder4() {
        assertTrue(ab.checkHit(0.5, -Math.sqrt(3) / 2, r));
    }

    @Test
    public void circleBorder5() {
        assertTrue(ab.checkHit(0, -1, r));
    }

    @Test
    public void circleBorder6() {
        assertTrue(ab.checkHit(0, -0.5, r));
    }

    @Test
    public void circleBorderGreen1() {
        assertTrue(ab.checkHit(0.5, -0.01, r));
    }

    @Test
    public void circleBorderGreen2() {
        assertTrue(ab.checkHit(0.99, -0.01, r));
    }

    @Test
    public void circleBorderGreen3() {
        assertTrue(ab.checkHit(Math.sqrt(3) / 2 - 0.01, -0.5 + 0.01, r));
    }

    @Test
    public void circleBorderGreen4() {
        assertTrue(ab.checkHit(0.5 - 0.01, -Math.sqrt(3) / 2 + 0.01, r));
    }

    @Test
    public void circleBorderGreen5() {
        assertTrue(ab.checkHit(0 + 0.01, -1 + 0.01, r));
    }

    @Test
    public void circleBorderGreen6() {
        assertTrue(ab.checkHit(0.01, -0.5, r));
    }

    @Test
    public void circleInside1() {
        assertTrue(ab.checkHit(0.25, -0.25, r));
    }

    @Test
    public void circleInside2() {
        assertTrue(ab.checkHit(0.5, -0.25, r));
    }

    @Test
    public void circleInside3() {
        assertTrue(ab.checkHit(0.75, -0.25, r));
    }

    @Test
    public void circleInside4() {
        assertTrue(ab.checkHit(0.25, -0.5, r));
    }

    @Test
    public void circleInside5() {
        assertTrue(ab.checkHit(0.5, -0.5, r));
    }

    @Test
    public void circleInside6() {
        assertTrue(ab.checkHit(0.25, -0.75, r));
    }

    @Test
    public void circleBorderRed1() {
        assertFalse(ab.checkHit(1 + 0.01, 0 - 0.01, r));
    }

    @Test
    public void circleBorderRed2() {
        assertFalse(ab.checkHit(Math.sqrt(3) / 2 + 0.01, -0.5, r));
    }

    @Test
    public void circleBorderRed3() {
        assertFalse(ab.checkHit(0.5, -Math.sqrt(3) / 2 - 0.01, r));
    }

    @Test
    public void circleBorderRed4() {
        assertFalse(ab.checkHit(0 - 0.01, -1 - 0.01, r));
    }

    @Test
    public void circleBorderRed5() {
        assertFalse(ab.checkHit(-0.01, -0.5, r));
    }

    // OUTSIDE TESTS
    @Test
    public void outsideTriangle1() {
        assertFalse(ab.checkHit(-2, -2, r));
    }

    @Test
    public void outsideTriangle2() {
        assertFalse(ab.checkHit(-1.5, -2, r));
    }

    @Test
    public void outsideSquare1() {
        assertFalse(ab.checkHit(2.5, 2.5, r));
    }

    @Test
    public void outsideSquare2() {
        assertFalse(ab.checkHit(2.5, 1, r));
    }

    @Test
    public void outsideSquare3() {
        assertFalse(ab.checkHit(0.5, 2.5, r));
    }

    @Test
    public void outsideCircle1() {
        assertFalse(ab.checkHit(1.5, -1, r));
    }

    @Test
    public void outsideCircle2() {
        assertFalse(ab.checkHit(0.5, -2, r));
    }

    @Test
    public void outsideCircle3() {
        assertFalse(ab.checkHit(2, -0.5, r));
    }

    @Test
    public void outsideEmpty1() {
        assertFalse(ab.checkHit(-1, -1, r));
    }

    @Test
    public void outsideEmpty2() {
        assertFalse(ab.checkHit(-1.5, -1.5, r));
    }

    @Test
    public void outsideEmpty3() {
        assertFalse(ab.checkHit(-2, -2, r));
    }
}