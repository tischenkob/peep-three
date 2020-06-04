package main.java.beans;

public class AreaBean {

    public void processEntryBean(EntryBean bean) {
        double x = bean.getX();
        double y = bean.getY();
        double r = bean.getR();
        bean.setHit(checkHit(x, y, r));
    }

    public boolean checkHit(double x, double y, double r) {
        boolean isHit = ((x >= 0 && y >= 0 && x <= r && y <= r)
                || ((Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(r / 2, 2)) && x >= 0 && y <= 0)
                || (x <= 0 && y >= 0 && y <= (x + r / 2)));
        return isHit;
    }
}