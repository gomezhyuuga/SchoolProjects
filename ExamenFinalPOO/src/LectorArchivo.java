
/**
 * Define el comportamiento para un bojeto que necesita leer datos de un archivo
 *
 * @author Fernando Gómez Herrera A01020319
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class LectorArchivo {

    private String nombreArchivo;

    public LectorArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public boolean verificarAperturaArchivo() {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("src/" + this.nombreArchivo));
            lector.close();
            // Se pudo abrir sin problemas
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LectorArchivo.class.getName()).log(Level.SEVERE, null, ex);
            // Ocurrió un error abriendo el archivo
            return false;
        } catch (IOException ex) {
            /* Se pudo abrir sin problemas pero hubo un error cerrándolo. Aún así
             devuelve false */
            Logger.getLogger(LectorArchivo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            // Error tal vez abriendo el archivo
            return false;
        }
    }

    public abstract String leerDatos();

    // Get y set
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
}
