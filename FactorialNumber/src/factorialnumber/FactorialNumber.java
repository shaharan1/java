package factorialnumber;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        int factorial = 1;

//        for(int i=1;i<=num;i++){
//        factorial *=i;       
//            System.out.println(num + " the Factorial value is "+  factorial);

        int i = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println(num + " Factorial value is " + factorial);
    }

}

}
