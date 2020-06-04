package main.java.beans;

public class AreaBean {

    public boolean checkHit(EntryBean bean) {
        double xx = bean.getX();
        double yy = bean.getY();
        double rr = bean.getR();
        boolean isHit = ((xx >= 0 && yy >= 0 && xx <= rr && yy <= rr)
                || ((Math.pow(xx, 2) + Math.pow(yy, 2) <= Math.pow(rr / 2, 2)) && xx >= 0 && yy <= 0)
                || (xx <= 0 && yy >= 0 && yy <= (xx + rr / 2)));
        return isHit;
    }
}