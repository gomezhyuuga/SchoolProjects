
/**
 * Esta clase representa un Halcón
 * @author A01020319 Fernando Gómez Herrera
 */
public class Halcon extends Animal {

    private String region;

    public Halcon(String region) {
        super("Halcón", 2);
        this.region = region;
    }

    public void cazar() {
        System.out.println("El Halcón buscando comida...");
    }

    @Override
    public String toString() {
        return super.toString() + " se encuentra en " + this.region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
