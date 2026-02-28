
package binaryiopracticeexam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BinaryIOPracticeExam {

    public static void main(String[] args) {
       
        try {
            FileOutputStream output=new FileOutputStream("C:\\Users\\Admin\\Desktop\\asd.txt");
            
            for(int i=1;i<=10;i++){
                try {
                    output.write(i);
                } catch (IOException ex) {
                    Logger.getLogger(BinaryIOPracticeExam.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIOPracticeExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream inputStream=new FileInputStream("C:\\Users\\Admin\\Desktop\\asd.txt");
            
            int value;
            while ((value=inputStream.read()) !=-1) {                
                System.out.println(value + "");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIOPracticeExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIOPracticeExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
