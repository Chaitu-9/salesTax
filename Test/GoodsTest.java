import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GoodsTest {

    @Test
    public void calculatingPriceWithAllTaxesIncludedForNonSalesTaxableItem() {
        Goods goods = new Goods(12.49);
        goods.calculateSalesTaxForNonTaxableItem();

        NonSalesTaxableItem mockbook = mock(NonSalesTaxableItem.class);
        when(mockbook.calcluateSalesTax())
                .thenReturn(12.49);

        double actualPriceWithTax = goods.PriceWithAllTaxesIncluded();

        assertThat(actualPriceWithTax, is(13.11));
    }

    @Test
    public void calculatingPriceWithAllTaxesIncludedForSalesTaxableItem() {
        Goods goods = new Goods(12.49);
        goods.calculateSalesTax();

        double actualPriceWithTax = goods.PriceWithAllTaxesIncluded();

        assertThat(actualPriceWithTax, is(14.43));
    }



}
