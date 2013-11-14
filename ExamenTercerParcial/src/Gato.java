
/**
 * Esta clase representa un Gato
 *
 * @author A01020319 Fernando Gómez Herrera
 */
public class Gato extends Animal {

    private String raza;

    public Gato(String raza) {
        super("Gato", 4);
        this.raza = raza;
    }

    public void jugar() {
        System.out.println("El Gato juguetón...");
    }

    @Override
    public String toString() {
        return super.toString() + " de raza " + this.raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
