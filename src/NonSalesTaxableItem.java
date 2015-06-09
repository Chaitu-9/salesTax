public class NonSalesTaxableItem{

    double price;
    public NonSalesTaxableItem(double price) {
        this.price = price;
    }

    public double calcluateSalesTax(){
        return price;
    }
}
