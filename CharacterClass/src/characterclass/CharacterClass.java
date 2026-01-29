
package characterclass;

import java.util.Locale;
import java.util.Scanner;

public class CharacterClass {



    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=input.next();
        
        String firstChar=name.substring(0, 1).toUpperCase();
        String lastChar =name.substring(1).toLowerCase();
        String newName=firstChar+lastChar;
        System.out.println(newName);
        
        
    }
    
}
