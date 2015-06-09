public class Goods {

    double price;
    public Goods(double price) {
        this.price=price;
    }

    public double PriceWithAllTaxesIncluded() {
        NonSalesTaxableItem someItem =new NonSalesTaxableItem(price);
        double priceIncludingSalesTax = someItem.calcluateSalesTax();
        double Totalcost = priceIncludingSalesTax*1.05;
        double roundOff = Math.round(Totalcost * 100.0) / 100.0;
        return roundOff;
    }
}
