package evedence1;

import evedence1.vehicle.Truck;
import java.util.Scanner;

public class Evedence1 {

    public static void main(String[] args) {
        
             // 1 No Question Answer
             
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = scanner.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        
        // 2 No Question Answer
        
        Truck truck=new Truck();
        truck.weight = 2500;
        truck.regularPrice = 100;
        
        System.out.println(truck.getSalePrice());
    }
}
