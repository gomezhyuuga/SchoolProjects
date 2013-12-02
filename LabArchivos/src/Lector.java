
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author A01371743
 */
public class Lector 
{
    private String nombre;
    
    public String leerArchivo(){
        
        String cadena ="";
        try {
            BufferedReader ent = new BufferedReader(new FileReader(nombre)); //es mejor autocompletar para que importe la clase
            while(ent.ready()){
                String linea = ent.readLine();
                cadena = cadena + linea +"\n";
                
            }
            ent.close();
        } catch (FileNotFoundException ex) {
            cadena = "no se puede abrir el archivo:" + nombre;
        } catch (IOException ex) {
            cadena = "error de E/S en el archivo:" + nombre;
        }
        
        return cadena;       
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void escribirDatos(String archivo){
        try {
            //abrir el archivo
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            //2. ESCRIBIMOS EL ARCHIVO
            BufferedReader entrada = new BufferedReader(new FileReader(nombre));
            while(entrada.ready()){
                String cadena = entrada.readLine();
                String[] datos = cadena.split(",");
                String carrera = datos[0];
                carrera = carrera.substring(0,3);
                if (carrera.startsWith("ISD")) {
                    carrera += "R";
                }
                
                salida.println(datos[1] + "," +  carrera );
            }
            //3. CERRAMOS EL ARCHIVO
            salida.close();
        } catch (IOException ex) {
            System.out.println("ERROR EN EL ARCHIVO DE SALIDA");
        }
        
    }
    public String filtrarCarrera(String carrera){
        String cadena = "";
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(nombre));
            while(entrada.ready()){
                String linea = entrada.readLine();
                if(linea.startsWith(carrera)){
                    cadena = cadena + linea + "\n";
                }
                //nunca se cierra aqui el archivo
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            cadena = "No se puede abrir el archivo:" + nombre;
        } catch (IOException ex) {
            cadena ="ERROR de E/S en el archivo:" + nombre;
        }
        
        
        return cadena;
    }
    public String calcularPorcentajes(){
        String cadena = "";
          try {
            BufferedReader entrada = new BufferedReader(new FileReader(nombre));
           int cISC=0;
           int cINT=0;
           int  cISDR=0;
            while(entrada.ready()){
                String linea = entrada.readLine();
                if(linea.startsWith("ISD")){
                    cISDR++;
                }else if(linea.startsWith("ISC")){
                    cISC++;
                }else{
                    cINT++;
                }
                //nunca se cierra aqui el archivo ADENTRO DEL WHILE
            }
            int total = cISC+cINT+cISDR;
            cadena = cadena +"% de ISC:" + (100*cISC/total)+"\n";
            cadena = cadena +"% de INT:" + (100*cINT/total)+"\n";
            cadena = cadena +"% de ISDR:" + (100*cISDR/total)+"\n";
            
            entrada.close();
        } catch (FileNotFoundException ex) {
            cadena = "No se puede abrir el archivo:" + nombre;
        } catch (IOException ex) {
            cadena ="ERROR de E/S en el archivo:" + nombre;
        }
        return cadena;
    }
}
