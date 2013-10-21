/**
 * Representa una cuenta de un banco
 * @authors
 * Francisco Barros         A01371000
 * Fernando Gómez Herrera   A01020319
 */

public abstract class CuentaBanco {

    private double saldo;

    public CuentaBanco() {
        saldo = 0.0;
    }

    public CuentaBanco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) {
        saldo = saldo - cantidad;
    }

    public abstract void transferir(double cantidad, CuentaBanco otra); 
    

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Saldo: $" + saldo;
    }
}