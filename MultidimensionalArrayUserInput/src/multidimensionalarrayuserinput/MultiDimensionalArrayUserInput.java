package multidimensionalarrayuserinput;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrayUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Row Size");
        int rows = scanner.nextInt();

        System.out.println("Enter Your Col Size");
        int Cols = scanner.nextInt();

        int numbers[][] = new int[rows][Cols];

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.println("Enter Value For Row "
                        + (row + 1) + " Col " + (col + 1));
                int userInput = scanner.nextInt();
                numbers[row][col] = userInput;
            }
        }
        System.out.println(Arrays.deepToString(numbers));

        for (int[] item : numbers) {
            // System.out.println(Arrays.toString(item));

            for (int single : item) {
                System.out.print(single + "\t");

            }
            System.out.println(" ");

        }

    }
}
