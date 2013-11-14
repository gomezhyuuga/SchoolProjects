/**
 *
 * @author A01020319
 */
public class PruebaDemo {
    public static void main(String[] args) {
        Demo.generadorNoSerie += 10;
        Demo a = new Demo("productoA");
        Demo b = new Demo("productoB");
        Demo c = new Demo("productoC");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
