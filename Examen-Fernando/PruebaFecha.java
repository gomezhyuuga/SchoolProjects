/**
 * EXAMEN PARCIAL POO
 * Esta clase sirve para probar la clase Fecha
 * Prueba constructor, get, set, toString
 * 
 * @author Fernando Gómez Herrera
 * @version 05/09/2013
 */
public class PruebaFecha
{
    public static void main(String[] args) {
        // Prueba de constructores
        Fecha fecha = new Fecha();
        Fecha fecha2 = new Fecha(4, 2, 1994);
        // Prueba de toString
        System.out.println( fecha );
        System.out.println( fecha2 );

        // Prueba de get. Debe imprimir 5
        System.out.println( fecha.getDia() );
        // Prueba de get. Debe imprimir 9
        System.out.println( fecha.getMes() );
        // Prueba de get. Debe imprimir 2013
        System.out.println( fecha.getAnio() );

        // Prueba de set.
        fecha.setDia( 30 );
        fecha.setMes( 4 );
        fecha.setAnio( 560 );
        System.out.println( fecha ); // Debe imprimir 30-04-0560

        // Prueba de formato de días
        Fecha fecha3 = new Fecha(10, 10, 10);
        Fecha fecha4 = new Fecha(20, 12, 100);
        Fecha fecha5 = new Fecha(1, 1, 1000);
        System.out.println( fecha3 );
        System.out.println( fecha4 );
        System.out.println( fecha5 );

        // Prueba de FrecuenciaCardiaca
        // FrecuenciaCardiaca frecuancia = new FrecuenciaCardiaca("Fernando Gómez Herrera", 19);
        // frecuancia.mostrarDatos();
    }
}
