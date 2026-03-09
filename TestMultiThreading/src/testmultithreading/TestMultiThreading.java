package testmultithreading;

import testmultithreading.printcar.PrintChar;

public class TestMultiThreading {

    public static void main(String[] args) {

        Runnable printA = new PrintChar('A', 20);
        Runnable printB = new PrintChar('B', 20);
        Runnable printC = new PrintChar('C', 20);

        Thread t1 = new Thread(printA);
        Thread t2 = new Thread(printB);
        Thread t3 = new Thread(printC);
        
        
        t1.start();
        t2.start();
        t3.start();

    }

}
