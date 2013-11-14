
/**
 *
 * @author A01020319 - Fernando Gómez Herrera
 */
public class PruebaExcepciones {

    public static void main(String[] args) {
        int a = 50;
        int b = 3;
        try {
            int c = a / b;
            System.out.println("C = " + c);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR. no aparece.");
        } catch (ArithmeticException e) {
            System.out.println("ERROR. El divisor no puede ser cero.");
        }


    }
}
