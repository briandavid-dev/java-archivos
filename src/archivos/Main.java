
package archivos;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        
        EscribeLog.add("Dale ");
        EscribeLog.add("Fecha ");
        EscribeLog.add("Fecha error");
        EscribeLog.add("Chuutaa");
        
        try {
            int cuenta = 8 / 0;
            System.out.println(cuenta);
            EscribeLog.add("Cuenta: "+ cuenta);
        } catch (Exception e){
            EscribeLog.add("Error " +e.toString());
        }
        
    }
    
}
