
/**
 *
 * @author Fernando Gómez Herrera
 */
public class PruebaEmpleado {

    public static void main(String[] args) {
        EmpleadoHora hEmp = new EmpleadoHora("Esteban López",
                "896-54-3217", 10.50, 40);
        EmpleadoSalario sEmp = new EmpleadoSalario("María Dunas",
                "456-14-3787", 800.0);

        System.out.println(hEmp + "\n");
        System.out.println(sEmp + "\n");

        System.out.println(hEmp.generarPago() + "\n");
        System.out.println(sEmp.generarPago() + "\n");

        sEmp.setSalario(sEmp.getSalario() * 1.10);
        System.out.println("Nuevo salario de María Dunas\n" + sEmp);

    }
}