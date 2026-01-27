
package java4thday;

import java.util.Scanner;


public class Java4thDay {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius");
        float radius = scanner.nextFloat();
        float area;
        
        if(radius <=0){
            System.out.println("Incorrect Radius");   
        }
            
       
        else {
            area = (float) (Math.PI * Math.pow(radius, 2));
            System.out.println("Area is " + area);
        }
    }
    
}
