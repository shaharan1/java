
package primenumber;

import java.util.Scanner;


public class PrimeNumber {

    
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println("Enter Your Number");
        
        
        for( num=0;num%2==0;num++){
            System.out.println(num + " is a prime Number");
        }
        
    }
    
}
