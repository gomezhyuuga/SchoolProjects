
/**
 * Sirve para crear objetos que almacenan y procesan la información de un grupo
 * de alumnos
 *
 * @author Fernando Gómez Herrera A01020319
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ListaGrupo extends LectorArchivo implements Formateable {

    private String grupo;

    public ListaGrupo(String grupo, String archivo) {
        super(archivo);
        this.grupo = grupo;
    }

    @Override
    public String leerDatos() {
        String datos = "";
        if (verificarAperturaArchivo()) {
            // Leer archivo
            try {
                BufferedReader br = new BufferedReader(new FileReader("src/" + getNombreArchivo()));
                while (br.ready()) {
                    String linea = br.readLine();
                    datos += linea + "\n";
                }
                br.close(); // Cerrar archivo
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ListaGrupo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ListaGrupo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido leer el archivo");
        }
        return datos;
    }

    @Override
    public String formatear(String cadena) {
        // Devolver matricula-promedio
        String datos = "";
        Scanner scaner = new Scanner(cadena);
        scaner.useDelimiter("\t|\n");
        while (scaner.hasNext()) {
            String matricula = scaner.next();
            scaner.next(); // Nombre no necesario
            int calif1 = scaner.nextInt();
            int calif2 = scaner.nextInt();
            int calif3 = scaner.nextInt();
            double promedio = (calif1 + calif2 + calif3) / 3.0;
            datos += matricula + " - " + promedio + "\n";
        }
        return datos;
    }

    // Get y set
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
