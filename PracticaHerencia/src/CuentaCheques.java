/**
 * Representa una cuenta de cheques de un banco
 * @authors
 * Francisco Barros         A01371000
 * Fernando Gómez Herrera   A01020319
 */

public class CuentaCheques extends CuentaBanco {

    private int contadorOperaciones;
    private final int OPERACIONES_GRATIS = 3;
    private final double COSTO_OPERACION = 15.0;

    public CuentaCheques(int saldoInicial) {
        super(saldoInicial);
        this.contadorOperaciones = 0;
    }

    @Override
    public void depositar(double cantidad) {
        super.depositar(cantidad);
        this.contadorOperaciones++;
    }

    @Override
    public void retirar(double cantidad) {
        super.retirar(cantidad);
        this.contadorOperaciones++;
    }

    public void restarCostos() {
        if (this.contadorOperaciones > OPERACIONES_GRATIS) {
//            System.out.println("COBRANDO OPERACIONES NO GRATUITAS");
            // Encontrar cantidad de operaciones a cobrar
            int operacionesPorCobrar = this.contadorOperaciones - OPERACIONES_GRATIS;
//            System.out.println("Operaciones: " + this.contadorOperaciones);
            this.retirar(operacionesPorCobrar * COSTO_OPERACION);
            // Reiniciar contador a 0
            this.contadorOperaciones = 0;
        } else {
            System.out.println("NO HAY OPERACIONES POR COBRAR.");
        }
    }

    @Override
    public void transferir(double cantidad, CuentaBanco otra) {
        otra.depositar(cantidad);
        this.retirar(cantidad);
        //this.contadorOperaciones++;
    }

    @Override
    public String toString() {
        return "Cuenta de cheques.\n" + super.toString();
    }
}
