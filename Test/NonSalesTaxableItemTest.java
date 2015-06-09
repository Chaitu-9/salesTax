import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NonSalesTaxableItemTest {

    @Test
    public void returnsPriceWithTaxIsZeroIfPriceOfObjectIsZero() {
        NonSalesTaxableItem someItem = new NonSalesTaxableItem(0.0);

        double actualResult = someItem.calcluateSalesTax();

        assertThat(actualResult, is(0.0));
    }

    @Test
    public void returnsSameValueForNonSalesTaxableItemIfPriceOfObjectIsNonZero() {
        NonSalesTaxableItem someItem = new NonSalesTaxableItem(12.49);

        double actualResult = someItem.calcluateSalesTax();

        assertThat(actualResult, is(12.49));
    }

}