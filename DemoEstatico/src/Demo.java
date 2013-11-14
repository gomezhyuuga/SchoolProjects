/*
 * Mostrar el uso de statif
 * @author Fernando Gómez Herrera
 */
public class Demo {
   private int noSerie;
   private String nombre;
   
   // Variable de clase
   public static int generadorNoSerie = 1;

    public Demo(String nombre) {
        this.nombre = nombre;
        this.noSerie = Demo.generadorNoSerie;
        Demo.generadorNoSerie++;
    }

    @Override
    public String toString() {
        return this.noSerie + " - " + this.nombre;
    }
}
