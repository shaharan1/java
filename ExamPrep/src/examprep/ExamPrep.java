package examprep;

public class ExamPrep {

    public static void main(String[] args) {

        //Exceptions Handling
        int a = 1, b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException  e) {
            e.printStackTrace();
        }

    }

}
