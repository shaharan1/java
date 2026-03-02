package classtestexam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassTestExam {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\Admin\\Desktop\\asd.txt");
        try {
            try (PrintWriter pw = new PrintWriter(f)) {
                pw.write("Hello \n");
                pw.write("Welcome To My World");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClassTestExam.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            try (Scanner s = new Scanner(f)) {
                while (s.hasNext()) {
                    
                    System.out.println(s.nextLine());
                    
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClassTestExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
