package lastpractice;

import java.util.Scanner;
import lastpractice.vehicle.Truck;

public class LastPractice {

    public static void main(String[] args) {

        Truck truck = new Truck();
        truck.weight = 2500;
        truck.regularPrice = 100;

        System.out.println(truck.getSalePrice());

        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }

        System.out.println("The Factorial " + 5 + " is " + factorial);

        Scanner s = new Scanner(System.in);
        int num = 0;

        System.out.println("Enter Number");
        int input = s.nextInt();

        while (input >= 0) {
            num += input;
            System.out.println("Enter Number");
            input = s.nextInt();
        }
        System.out.println("Sum of all positive number " + num);
    }

}
