
package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EscribeLog {
    public static void new_(String glosa){
        File archivo = new File("C:\\Users\\DavidOchoaBermudez\\Desktop\\Archivos\\servicio-archivos.log");
        
        try {
            PrintWriter escribirArchivo = new PrintWriter(archivo);
            escribirArchivo.append(glosa);
            escribirArchivo.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
    public static void add(String glosa){
        File archivo = new File("C:\\Users\\DavidOchoaBermudez\\Desktop\\Archivos\\servicio-archivos.log");
        
        try {
            PrintWriter escribirArchivo = new PrintWriter(new FileWriter(archivo, true));
            escribirArchivo.println(glosa);
            escribirArchivo.close();
            System.out.println("Escribiendo en archivo");
        } catch (FileNotFoundException e) {
            // System.out.println(e);
            e.printStackTrace(System.out);
        } catch (IOException e) {
            // System.out.println(e);
            e.printStackTrace(System.out);
        }
    }

    static void add(Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
