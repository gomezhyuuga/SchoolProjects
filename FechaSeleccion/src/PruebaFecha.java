/*
 * Prueba la calse fecha
 */

/**
 *
 * @author A01020319
 */
public class PruebaFecha {

    public static void main(String[] args) {
        Fecha hoy = new Fecha();
        System.out.println("Hoy es: " + hoy);
        hoy = new Fecha(31, 12, 2013);
        System.out.println("Hoy es: " + hoy);
        for (int i = 0; i < 100; i++) {
            hoy.avanzar();
            System.out.println("Hoy es: " + hoy);
        }
    }
}
