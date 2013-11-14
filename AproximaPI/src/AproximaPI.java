/*
 * Esta claxe permite calcular el valor de PI
 */

/**
 *
 * @author Gómez Hyuuga
 */
public class AproximaPI {

    private double pi;
    private int limite;

    public AproximaPI(int limite) {
        this.limite = limite;
        this.pi = 0;
    }

    public void calcularPI() {
        this.pi = 0; // acumulador
        int factor = 1;
        for (int i = 1; i <= limite; i += 2) {
            this.pi += factor * (1.0/i);
            // Cambiar signo
            factor = -factor;
        }
        this.pi *= 4;
        //System.out.println("Valor aproximado de pi: " + this.pi);
    }

    @Override
    public String toString() {
        return "PI: " + this.pi;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
}
