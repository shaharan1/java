package findmaxnumber;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Number Do You Want to Compare");

        int n = scanner.nextInt();

        int numbers[] = new int[n];

        System.out.println("Begening of Loop" + Arrays.toString(numbers));
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Your " + (i + 1) + " Number");
            int userInput = scanner.nextInt();

            numbers[i] = userInput;

        }

        System.out.println("Endinging of Loop" + Arrays.toString(numbers));
        findMaxValue(numbers);
        findMinValue(numbers);
        findAvarageValue(numbers);
    }

    public static void findMaxValue(int[] numbers) {
        int max = 0;

        for (int item : numbers) {
            if (item >= max) {
                max = item;
            }
        }
        System.out.println("Max Number is " + max);

    }

    public static void findMinValue(int[] numbers) {
        int min = numbers[0];

        for (int item : numbers) {
            if (item < min) {
                min = item;
            }
        }
        System.out.println("Min Number is " + min);
    }

    public static void findAvarageValue(int[] numbers) {
        int sum = 0;
        for (int item : numbers) {
            sum += item;
        }
        double avarage = sum / numbers.length;
        System.out.println("Avarage Number is " + avarage);
    }

}
