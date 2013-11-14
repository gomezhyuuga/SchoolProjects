/**
 *
 * @author A01020319 Fernando Gómez Herrera
 */
public class Numero {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }
    
    public double raizCuadrada() {
        if (this.numero < 0) {
            throw new ArithmeticException("No pueden haber raíces negativas.");
        }
        return Math.sqrt(this.numero);
    }
    
    public double logaritmo() {
        if (this.numero <= 0) {
            throw new ArithmeticException("No se puede calcular el logaritmo natural del número <= 0.");
        }
        return Math.log10(numero);
    }

    @Override
    public String toString() {
        return "" + this.numero;
    }
}