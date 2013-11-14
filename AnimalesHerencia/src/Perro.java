/**
 *
 * @author Fernando Gómez Herrera
 */

public class Perro extends Animal {

    public Perro(String comida, int hambre) {
        super(comida, hambre);
    }

    @Override
    public void hablar() {
        System.out.println("El perro ladra!! ggrrrrgrrgrr");
    }
    
    public void ladrar() {
        System.out.println("whoof whoof");
    }

    @Override
    public void dormir() {
        System.out.println("El perro está ");
        super.dormir();
    }

    @Override
    public String toString() {
        return "Un perro con estas características:\n" + super.toString();
    }
}