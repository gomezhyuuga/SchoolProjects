/**
 * Representa una cuenta de tipo ahorro de un banco
 * @authors
 * Francisco Barros         A01371000
 * Fernando Gómez Herrera   A01020319
 */

public class CuentaAhorro extends CuentaBanco {

    private double tasaInteres;

    public CuentaAhorro(double tasaInteres) {
        super(); // es lo mismo que super(0.0)
        this.tasaInteres = tasaInteres;
    }

    public void agregarInteres() {
//        System.out.println("Agreando interes a " + getSaldo());
        double interes = this.tasaInteres * getSaldo();
//        System.out.println("Interes: " + interes);
        super.depositar(interes);
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= getSaldo()) {
            super.retirar(cantidad);
        } else {
            System.out.println("NO CUENTAS CON LOS FONDOS SUFICIENTES");
        }
    }

    @Override
    public void transferir(double cantidad, CuentaBanco otra) {
        if (cantidad <= getSaldo()) {
            otra.depositar(cantidad);
            this.retirar(cantidad);
        } else {
            System.out.println("NO CUENTAS CON LOS FONDOS SUFICIENTES");
        }
    }

    @Override
    public String toString() {
        return "Cuenta de ahorro.\n" + super.toString();
    }
}
