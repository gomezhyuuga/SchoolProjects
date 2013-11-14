/**
 *
 * @author LUIS EDUARDO Y FERNANDO
 */
public class OtherVector extends Vector {

    public OtherVector(double x, double y) {
        super(x, y);
    }

    @Override
    public double magnitude() {
        double magnitud;
        magnitud = Math.abs(x) + Math.abs(y);
        return magnitud;
    }
}
