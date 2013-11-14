/**
 *
 * @author Gómez Hyuuga
 */
public class PruebaAproximaPI {
    public static void main(String[] args) {
        int k = 1;
        boolean detener = false;
        AproximaPI ap = new AproximaPI(k);
        while (detener != true) {
            k += 1;
            ap.setLimite(k);
            ap.calcularPI();
            double pi = ap.getPi();
            double temp = pi-3;
            int decimales = (int) (temp * 10000) ;
            System.out.println("PI: " + pi);
            System.out.println("temp: " + temp);
            System.out.println("decimales: " + decimales);
            System.out.println("k: " + k);
            if (decimales == 1416) {
                detener = true;
                System.out.println("ENCONTRADO");
            }
        }
    }
}
