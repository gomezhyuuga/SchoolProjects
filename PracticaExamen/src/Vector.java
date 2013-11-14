/**
 *
 * @author LUIS EDUARDO Y FERNANDO
 */
public abstract class Vector {

    protected double x;
    protected double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double magnitude() {

        return 0;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
