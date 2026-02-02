package testarray;

import java.util.Arrays;

public class TestArray {

    public static void main(String[] args) {

        String studentsName[] = new String[14];
        int studentsAge[] = new int[14];
        
        int number[]={10,20,30,40,50,60,80,90};

        studentsName[0] = "Badrul";
        studentsName[2] = "Pk";
        studentsName[1] = "Hasan";
        studentsName[4] = "Tanvir";

        studentsAge[0] = 25;
        studentsAge[1] = 26;
        studentsAge[5] = 24;
        studentsAge[3] = 23;
        studentsAge[7] = 27;

        System.out.println(Arrays.toString(studentsName));
        System.out.println(Arrays.toString(studentsAge));
      
        
        System.out.println(studentsName[3]+" "+studentsAge[5]);

    }

}
