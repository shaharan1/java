package roompractice;

import java.util.Scanner;

public class RoomPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Mark");

        int marks = scanner.nextInt();

        String grade;
        if (marks >= 80 && marks <= 100) {
            grade = "A+";
        } else if (marks >= 70 && marks <= 79) {
            grade = "A";
        } else if (marks >= 60 && marks <= 69) {
            grade = "A-";
        } else if (marks >= 50 && marks <= 59) {
            grade = "B";
        } else if (marks >= 40 && marks <= 49) {
            grade = "C";
        } else if (marks < 40 && marks >= 0) {
            grade = "F";
        } else {
            grade = "Invalid Marks";
        }
        System.out.println("The Result is " + grade);
    }

}
