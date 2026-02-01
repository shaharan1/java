package methodeclass;

import java.util.Scanner;

public class MethodeClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int input = scanner.nextInt();
        checkFactorialNumber(input);

    }

    public static void checkFactorialNumber(int number) {

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;

        }
        System.out.println(number + " Factorial Value is " + factorial);

    }

}
