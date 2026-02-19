package filewrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileWrite {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Admin\\Desktop\\asd.txt");
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.write("Are You Fajil \n");
            pw.write("No,You Are a Fajil \n");
            pw.println("Ha Ha Ha");

            for (int i = 1; i <= 100; i++) {
                pw.write(i+ ",");
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            Scanner s=new Scanner(file);
            
            while(s.hasNext()){
                System.out.println(s.nextLine());
              
            }
            
              s.close();
              
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
