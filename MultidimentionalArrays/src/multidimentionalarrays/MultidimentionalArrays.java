package multidimentionalarrays;

import java.util.Arrays;

public class MultidimentionalArrays {

    public static void main(String[] args) {

        int[]ages[]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(ages));
        
        
        int numbers[][] = new int[3][4];

        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[0][3] = 4;

        numbers[1][0] = 5;
        numbers[1][1] = 6;
        numbers[1][2] = 7;
        numbers[1][3] = 8;

        numbers[2][0] = 9;
        numbers[2][1] = 10;
        numbers[2][2] = 11;
        numbers[2][3] = 12;
        
        

        System.out.println(Arrays.deepToString(numbers));
         int sum=0;
        for (int[] item : numbers) {
            // System.out.println(Arrays.toString(item));

            for (int single : item) {
                System.out.print(single + "\t");
                sum +=single;
            }
            System.out.println(" ");

        }
        
        
//        int sum = 0;
//        for (int[] number : numbers) {
//            for (int j = 0; j < number.length; j++) {
//                sum += number[j];
//            }
//        }
         System.out.println("Total sum = " + sum);
    }

        
    }
    
