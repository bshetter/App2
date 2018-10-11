package App2;

/**
 * This class represents a Point in the Cartesian plane at (x, y)
 *
 * @author brianshetter
 */
public class Point {

    private double mX;
    private double mY;

    public Point(double pX, double pY) {
        setX(pX);
        setY(pY);
    }

    public double getX() {
        return mX;
    }

    public double getY() {
        return mY;
    }

    public void setX(double pX) {
        mX = pX;
    }

    public void setY(double pY) {
        mY = pY;
    }

}
