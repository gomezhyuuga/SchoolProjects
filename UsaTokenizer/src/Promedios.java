
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A01020319
 */
public class Promedios {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("src/datos/promedios.txt"));
            float promedio = 0;
            int cantidadMaterias = 0;
            while (bf.ready()) {
                String line = bf.readLine();
                int calif;
                String nombre;
                // "Matemáticas,80"
                /*StringTokenizer st = new StringTokenizer(line, ",");
                nombre = st.nextToken();
                calif = Integer.parseInt(st.nextToken());*/
                String[] els = line.split(",");
                nombre = els[0];
                calif = Integer.parseInt(els[1]);
                promedio += calif;
                if (calif < 80) {
                    System.out.println(nombre);
                }
                cantidadMaterias++;
            }
            promedio = promedio/cantidadMaterias;
            System.out.println("Cantidad de materias: " + cantidadMaterias);
            System.out.println("El promedio es: " + promedio);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Promedios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Promedios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
