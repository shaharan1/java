
package evedence1.vehicle;

public class Vehicle {
 
    public int speed;
    public double regularPrice;
    public String color;

    public Vehicle() {
    }

    public Vehicle(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
     public double getSalePrice() {

        return regularPrice;

    }
}
