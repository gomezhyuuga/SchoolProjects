/**
 * Prueba para las clases CuentaBanco, CuentaAhorro y CuentaCheques
 * @authors
 * Francisco Barros         A01371000
 * Fernando Gómez Herrera   A01020319
 */

public class PruebaHerencia {

    public static void main(String[] args) {
        CuentaAhorro ahorrosAbue = new CuentaAhorro(0.5);
        CuentaCheques chequesTio = new CuentaCheques(100);
//        System.out.println("Depositando 10000 a abuelita");
        ahorrosAbue.depositar(10000);
//        System.out.println("Transfiriendo 2000 de abuelita->tío");
        ahorrosAbue.transferir(2000, chequesTio);
//        System.out.println("Retirando 1500 de tío");
        chequesTio.retirar(1500);
//        System.out.println("Retirando 80 de tío");
        chequesTio.retirar(80);
//        System.out.println("Transfiriendo 1000 de abuelita->tío");
        ahorrosAbue.transferir(1000, chequesTio);
//        System.out.println("Retirando 400 de tío");
        chequesTio.retirar(400);
//        System.out.println("Transfiriendo 5000 de tío->abuelita");
        chequesTio.transferir(5000, ahorrosAbue);
//        System.out.println("Retirando 15000 de abuelita");
        ahorrosAbue.retirar(15000); // Debe mandar mensaje de error
        
        // Fin de mes
        System.out.println("Fin de mes");
//        System.out.println("ABUELITA");
//        System.out.println(ahorrosAbue);
//        System.out.println("TÍO");
//        System.out.println(chequesTio);
        
        ahorrosAbue.agregarInteres();
        chequesTio.restarCostos();
        
        System.out.println("Saldo en la cuenta de mi abuelita = $ " + ahorrosAbue);
        System.out.println("Saldo en la cuenta de mi tio = $ " + chequesTio);
    }
}