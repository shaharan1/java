package generic;

import generic.test.Student;
import java.util.ArrayList;

public class Generic {

    public static void main(String[] args) {

        ArrayList<Student> sList = new ArrayList<>();
        Student s = new Student(03, "Abul", "abul@gmail.com");

        sList.add(new Student(01, "Badrul", "badrul@gmail.com"));
        sList.add(new Student(02, "PK", "pk@gmail.com"));
        sList.add(s);
        System.out.println(sList);

    }

}
