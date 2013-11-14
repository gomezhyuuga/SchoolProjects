
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
                // "Matemáticas,80"
                StringTokenizer st = new StringTokenizer(line, ",");
                st.nextToken();
                promedio += Integer.parseInt(st.nextToken());
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
