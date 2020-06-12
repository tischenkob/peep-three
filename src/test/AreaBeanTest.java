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
    public void triangleCorner1() {
        assertTrue(ab.checkHit(-1, 0, r));
    }

    @Test
    public void triangleCorner2() {
        assertTrue(ab.checkHit(-0.999, 0.001, r));
    }

    @Test
    public void testCheckHit2() {
        assertTrue(ab.checkHit(-0.5, 0, r));
    }

    @Test
    public void testCheckHit3() {
        assertTrue(ab.checkHit(-0.5, 0, r));
    }

    @Test
    public void testCheckHit4() {
        assertFalse(ab.checkHit(-0.5, -0.0001, r));
    }

    // RECTANGLE TESTS

    // CIRCLE TESTS

    // EMPTY TESTS

}