package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.beans.AreaBean;

public class AreaBeanTest {
    AreaBean ab = new AreaBean();
    double r = 2;

    @Test
    public void testCheckHit1() {
        assertTrue(ab.checkHit(1, 1, r));
    }

}