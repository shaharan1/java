package evedence1.vehicle;

public class Truck extends Vehicle {

    public int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, double regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {

        double mainPrice = super.getSalePrice();

        if (weight > 2000) {
            return 0.9 * mainPrice;
        } else {
            return regularPrice;
        }

    }

}
