/**
 * Hereda de Empleado. Tiene un salario fijo.
 * @author Fernando Gómez Herrera
 */
public class EmpleadoSalario extends Empleado {
    private double salario; // sueldo mensual

    public EmpleadoSalario(String nombre, String numeroSS, double salario) {
        super(nombre, numeroSS);
        this.salario = salario;
    }

    @Override
    public String generarPago() {
        return "Pago a " + this.nombre + "(" + this.numeroSS + ") $" + this.salario;
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        cadena += "\n";
        cadena += "Tipo:\t\tSalario\nSalario:\t" + this.salario;
        return cadena;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}