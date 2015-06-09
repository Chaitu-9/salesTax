public class Goods {

    double price,priceIncludingSalesTax = price;
    public Goods(double price) {
        this.price=price;
    }

    public double PriceWithAllTaxesIncluded() {
        double Totalcost = priceIncludingSalesTax*1.05;
        double roundOff = Math.round(Totalcost * 100.0) / 100.0;
        return roundOff;
    }

    public void calculateSalesTax() {
        priceIncludingSalesTax=price*11/10;
    }

    public void calculateSalesTaxForNonTaxableItem(){
        NonSalesTaxableItem someItem =new NonSalesTaxableItem(price);
        priceIncludingSalesTax = someItem.calcluateSalesTax();
    }
}
