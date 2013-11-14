/**
 *
 * @author LUIS EDUARDO Y FERNANDO
 */
public class StandardVector extends Vector {

    public StandardVector(double x, double y) {
        super(x, y);
    }

    @Override
    public double magnitude() {
        double magnitud = 0.0;
        magnitud = Math.sqrt(x * x + y * y);
        return magnitud;
    }
}
