package nextedifelse;

import java.util.Scanner;

public class NextedIfElse {

    public static void main(String[] args) {
           
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Value");
//        double bmi = input.nextDouble();
//        if (bmi < 18.5) {
//            System.out.println("Underweight");
//        } else if (bmi < 25) {
//            System.out.println("Normal");
//        } else if (bmi < 29) {
//            System.out.println("Over");
//        } else {
//            System.out.println("Obse");
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Number");
//        int number = input.nextInt();
//        if (number % 2 == 0) {
//            System.out.println(number + " is a Even number");
//        } else {
//            System.out.println(number + " is a Odd number");
//        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number1");
        int num1 = input.nextInt();

        System.out.println("Enter Number2");
        int num2 = input.nextInt();

        System.out.println("Enter + - * /");
        String sum = input.next();

        switch (sum) {
            case "+" : System.out.println("The Result is " + (num1 + num2)); break ;
            case "-" : System.out.println("The Result is " + (num1 - num2)); break ;
            case "*" : System.out.println("The Result is " + (num1 * num2)); break ;
            case "/" : System.out.println("The Result is " + (num1/num2)); break ;
            default  : {
            }
        }
    }
}




