
package evd2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EVD2 {

    
    public static void main(String[] args) {
       
        File file=new File("Hello.dat");
        
        try {
            FileOutputStream output=new FileOutputStream(file);
            for (int i = 0; i <= 10; i++) {
               output.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVD2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVD2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try {
            FileInputStream input=new FileInputStream(file);
            int value;
            while ((value=input.read()) !=-1) {                
                System.out.println(value);  
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVD2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVD2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
