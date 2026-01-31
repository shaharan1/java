//package guessgame;
//
//import java.util.Scanner;
//
//public class GuessGame {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        int randomNumber = (int) (Math.random() * 10);
//      
//       
//
//        int chance = 3;
//
//        while (chance >= 1) {
//
//             System.out.println("Enter Your Guess Number");
//              int guessNumber = scanner.nextInt();
//              
//            if (guessNumber == randomNumber) {
//                System.out.println("You Win");
//                break;
//            } else if (guessNumber > randomNumber) {
//                System.out.println("Your Guess Number is Larger");
//                             
//            } else {
//                System.out.println("Your Guess Number is Smaller");               
//            }
//            chance--;
//        }
//        System.out.println("System Guess " + randomNumber);
//    }
//}
package guessgame;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = scanner.nextInt();
        int count = 0;
        int number = 2;
        while (count < num) {
            boolean isPrime = true;

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;

                }

            }
            if (isPrime) {
                count++;
                if (count % num == 0) {
                    System.out.println(number);
                } else {
                    System.out.println(number + "");
                }
            }
            number++;
        }

    }
}
