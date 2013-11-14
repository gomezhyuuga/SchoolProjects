
/**
 * Esta es una clase abstracta que representa un Animal
 *
 * @author A01020319 Fernando Gómez Herrera
 */
public abstract class Animal {

    private int patas;
    private String nombre;

    public Animal(String nombre, int patas) {
        this.patas = patas;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Un " + this.nombre + " con " + this.patas + " patas";
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
