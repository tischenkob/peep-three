package main.java.beans;

/**
 * Checks if hit
 */
public class AreaBean {

    public void processEntryBean(EntryBean bean) {
        double x = bean.getX();
        double y = bean.getY();
        double r = bean.getR();
        bean.setHit(checkHit(x, y, r));
    }

    public boolean checkHit(double x, double y, double r) {
        boolean isInSquare = (x >= 0 && y >= 0 && x <= r && y <= r);
        boolean isInCircle = ((Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(r / 2, 2)) && x >= 0 && y <= 0);
        boolean isInTriangle = (x <= 0 && y >= 0 && y <= (x + r / 2));
        boolean isHit = (isInSquare || isInCircle || isInTriangle);
        return isHit;
    }
}