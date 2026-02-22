package lastnightbeforeexam;

import java.util.Scanner;

public class LastNightBeforeExam {

    public static void main(String[] args) {
        //PositiveNegetiveNumber
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter Number");
        int input = s.nextInt();
        while (input >= 0) {
            sum += input;
            System.out.println("Enter Number");
            input = s.nextInt();
        }
        System.out.println("Sum of Positive Number is " + sum);

        // PrimeNumber
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int inputs = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= inputs; i++) {
            if (inputs % i == 0) {
                count++;
            }
        }
        if (count <= 2) {
            System.out.println(input + " Prime Number");

        } else {
            System.out.println(input + " Not a Prime Number");

        }

        //MaxMin
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = s1.nextInt();
        int number[] = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            number[i] = s1.nextInt();
        }
        int max = number[0];
        int min = number[0];

        for (int item : number) {
            if (max <= item) {
                max = item;
            }
            if (min >= item) {
                min = item;
            }
        }
        System.out.println("Largest Number is " + max);
        System.out.println("Lowest Number is " + min);

        //FactorialNumber
        int num = 5;
        int factorial = 1;
        int i = 1;

        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println(num + " Factorial value is " + factorial);
    }

    public class Vehicle {

        protected int speed;
        protected double regularPrice;
        protected String color;

        public Vehicle() {
        }
        public Vehicle(double regularPrice) {
            this.regularPrice = regularPrice;
        }
        public double getSalePrice() {
            return regularPrice;
        }
    }

    public class Truck extends Vehicle {

        protected int weight;
        public Truck() {
        }
        public Truck(int weight) {
            this.weight = weight;
        }
        public Truck(int weight, double regularPrice) {
            super(regularPrice);
            this.weight = weight;
        }

        @Override
        public double getSalePrice() {
            return (weight > 2000) ? regularPrice * .9 : regularPrice;
        }

    }

    public class ExamPrep {

        public static void main(String[] args) {
            Truck truck = new Truck(2500, 200);
            System.out.println(truck.getSalePrice());
        }
    }
}
