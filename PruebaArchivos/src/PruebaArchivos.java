
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A01020319
 */
public class PruebaArchivos {
    public static void main(String[] args) {
        try {
            BufferedReader entrada = new BufferedReader(new FileReader("src/PruebaArchivos.java"));
            int lineaN = 1;
            while(entrada.ready()){
                String linea = entrada.readLine();
                //System.out.println("#" + lineaN + ">" + linea.toUpperCase());
                if (linea.indexOf("lineaN++") != -1) {
                    System.out.println("Texto encontrado en línea #" + lineaN);
                }
                lineaN++;
            }
            
            entrada.close();
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe");
        } catch (IOException ex) {
            Logger.getLogger(PruebaArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
