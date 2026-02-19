package classtest.vehicle;

public class Truck extends Vehicle {

    public int weight;

    public Truck() {

    }
    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        double mainPrice = super.getSalePrice();

        if (weight > 2000) {
            return mainPrice * 0.9;
        } else {
            return mainPrice;
        }

    }

}
