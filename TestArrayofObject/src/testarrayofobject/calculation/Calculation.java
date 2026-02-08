package testarrayofobject.calculation;

public class Calculation {

    public double findFinalPrice(double unitPrice, double quantity) {
    double actualPrice = unitPrice * quantity;
    double finalPrice = 0;

    if (actualPrice <= 100) {
        finalPrice = actualPrice - (actualPrice * 0.02); 
    } else if (actualPrice <= 200) {
        finalPrice = actualPrice - (actualPrice * 0.03); 
    } else if (actualPrice <= 400) {
        finalPrice = actualPrice - (actualPrice * 0.04); 
    } else {
        finalPrice = actualPrice - (actualPrice * 0.05); 
    }

    return finalPrice;
}


}
