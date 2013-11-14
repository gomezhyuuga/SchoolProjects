/**
 *
 * @author A01020319 Fernando Gómez Herrera
 */
public class AppAnimal {
    public static void main(String[] args) {
        System.out.println("Nombre: Fernando Gómez Herrera");
        System.out.println("Matrícula: 1020319\n");
        Gato gato = new Gato("Persa");
        Halcon halcon = new Halcon("San Luis Potosí");
        mostrarInfo(gato);
        mostrarInfo(halcon);
        hacerActividad(gato);
        hacerActividad(halcon);
        gato.setPatas(3);
        gato.setRaza("Siamés");
        halcon.setRegion("Estado de México");
        mostrarInfo(gato);
        mostrarInfo(halcon);
    }
    
    public static void mostrarInfo(Animal a) {
        System.out.println(a.toString());
    }
    
    public static void hacerActividad(Animal a) {
        if (a instanceof Gato) {
            ((Gato) a).jugar();
        } else if(a instanceof Halcon) {
            ((Halcon) a).cazar();
        } else {
            System.out.println("No hay nada que hacer :O");
        }
    }
}
