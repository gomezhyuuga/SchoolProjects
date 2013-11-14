
import java.util.Scanner;

/**
 *
 * @author A01020319 Fernando Gómez Herrera
 */
public class PruebaNumero {

    public static void main(String[] args) {
        boolean error = false;
        Numero numero;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingresa el número entero que quieras:");
            numero = new Numero(leer.nextInt());
            System.out.println("Número: " + numero);
            try {
                System.out.println("Raíz: " + numero.raizCuadrada());
                System.out.println("Logaritmo natural: " + numero.logaritmo());
                error = false;
            } catch (ArithmeticException e) {
                error = true;
                System.out.println("ERROR");
                System.out.println(e);
            }
        } while (error);
    }
}
