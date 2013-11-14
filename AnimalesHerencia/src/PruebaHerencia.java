/**
 *
 * @author A01020319
 */

public class PruebaHerencia {
    public static void main(String[] args) {
        Leon leon = new Leon("carne", 5);
        Perro perro = new Perro("croquetas", 3);
        // Animal a = new Animal("abc", 4) {}; // error
        
        System.out.println(leon);
        System.out.println(perro);
             
        Animal animal = new Perro("doggy", 3);
    }
}