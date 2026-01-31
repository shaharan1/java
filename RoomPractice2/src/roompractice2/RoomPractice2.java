package roompractice2;

import java.util.Scanner;

public class RoomPractice2 {

    public static void main(String[] args) {

        System.out.println("Sum= " + sum(10, 80, 10));
        System.out.println("Multiply= " + multiply(5, 8, 4));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = scanner.nextInt();
        int count = 0;

        if (number <= 1) {
            System.out.println(number + " is NOT a Prime Number.");
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is Not a Prime Number.");
            }
            
            }

        }
    


    

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

}
