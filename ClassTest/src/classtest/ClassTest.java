package classtest;

import classtest.vehicle.Truck;

public class ClassTest {

    public static void main(String[] args) {

        Truck t = new Truck();
        
        t.weight = 2500;
        t.regularPrice= 100;
        System.out.println(t.getSalePrice());   
    }

}
