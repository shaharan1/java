package testarrayofobject;

import testarrayofobject.calculation.Calculation;

public class TestArrayofObject {

    public static void main(String[] args) {

        Calculation c = new Calculation();
        System.out.println(c.findFinalPrice(5, 25));
        System.out.println(c.findFinalPrice(30, 20));
        System.out.println(c.findFinalPrice(20, 5));
        System.out.println(c.findFinalPrice(15, 10));

    }

}
