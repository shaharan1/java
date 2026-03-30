package aexam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AExam {
    
    public static void main(String[] args) {

//                       Generic
//        List<String> names = new ArrayList<>();
//        names.add("JEE");
//        names.add("Gave");
//        names.add("PHP");
//        names.add("ACAD");
//        System.out.println(names);


//                       Recursion
//        System.out.println(factorial(5));
        
        
        
//                  Read and Write
//        
//        File file=new File("Hello.dat");
//        
//        try {
//            FileOutputStream output = new FileOutputStream(file);
//            for (int i = 0; i <= 10; i++) {
//                output.write(i);
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(AExam.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(AExam.class.getName()).log(Level.SEVERE, null, ex);
//        }

//        try {
//            FileInputStream input=new FileInputStream(file);
//            int value;
//            while ((value=input.read()) !=-1) {                
//                System.out.println(value);
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(AExam.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(AExam.class.getName()).log(Level.SEVERE, null, ex);
//        }


    }

//                           Recursion
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
        
    }
    
}
