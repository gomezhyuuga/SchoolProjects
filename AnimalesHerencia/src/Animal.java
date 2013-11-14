/**
 * Representa a un Animal
 * @author Fernando Gómez Herrera A01020319
 */
public abstract class Animal {
    protected String comida;
    private int hambre;

    public Animal(String comida, int hambre) {
        this.comida = comida;
        this.hambre = hambre;
    }
    
    public abstract void hablar();
    
    public void comer() {
        if (this.hambre > 0) {
            this.hambre--;
        }
    }
    
    public void dormir() {
        System.out.println("Durmiendo...");
    }

    @Override
    public String toString() {
        return "Comida: " + this.comida + "\nHambre: " + this.hambre;
    }
}