
package exception;


public class ExcepTion {

    
    public static void main(String[] args) {
        int [] number=new int[3];
        
        try {
          number[3]=10;
        } catch (Exception e) {
            
            System.out.println(e + " Wrong Index Number");
        }
    }
    
}
