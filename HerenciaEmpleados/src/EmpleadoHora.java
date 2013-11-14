/**
 * Representa un Empleado que le pagan por hora
 * @author Fernando Gómez Herrera
 */
public class EmpleadoHora extends Empleado {
    // Variables de instancia
    private double pagoHora;
    private double horasTrabajadas;

    // Constructor
    public EmpleadoHora(String nombre, String numeroSS, double pagoHora, double horasTrabajadas) {
        super(nombre, numeroSS); // Llama al CONSTRUCTOR de la superclase
        this.pagoHora = pagoHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String generarPago() {
        return "Pago a " + nombre + " (" + numeroSS + ") $" + (pagoHora*horasTrabajadas);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo:\tHoras"
                + "\nPagoHr:\t$" + pagoHora
                + "\nHoras:\t" + horasTrabajadas;
    }
    
    // Get y set
    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}