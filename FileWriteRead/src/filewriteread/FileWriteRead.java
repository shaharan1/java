package filewriteread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileWriteRead {
    
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop\\Exam.txt");
        
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.write("Hello ,Practice Hard \n");
            writer.write("March 3 Practical Exam \n");
            
            for (int i = 0; i < 101; i++) {
                writer.write(i + " , ");
            }
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileWriteRead.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Scanner s=new Scanner(file);
            while (s.hasNext()) {                
                System.out.println(s.nextLine());
            }
            s.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileWriteRead.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
