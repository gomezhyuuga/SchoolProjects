/**
 *
 * @author Fernando Gómez Herrera
 */
public class Leon extends Animal {

    public Leon(String comida, int hambre) {
        super(comida, hambre);
    }

    @Override
    public void hablar() {
        System.out.println("El león ruge!! ggrrrrgrrgrr");
    }
    
    public void rugir() {
        System.out.println("grrrrgrgrgrgrggr");
    }

    @Override
    public void dormir() {
        System.out.println("El león está ");
        super.dormir();
    }

    @Override
    public String toString() {
        return "Un león con estas características:\n" + super.toString();
    }
}