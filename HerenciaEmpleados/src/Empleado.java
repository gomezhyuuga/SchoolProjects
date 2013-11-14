/**
 * Representa un Empleado con su nombre y número de Seguro Social
 * @author Fernando Gómez Herrera
 */
public class Empleado {
    protected String nombre;
    protected String numeroSS;

    public Empleado(String nombre, String numeroSS) {
        this.nombre = nombre;
        this.numeroSS = numeroSS;
    }
    
    public String generarPago() {
        return ""; // No hay forma de generar el pago
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Nombre:\t\t" + this.nombre + "\nNúmeroSS:\t" + this.numeroSS;
    }
}