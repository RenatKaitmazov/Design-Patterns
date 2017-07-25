package structural.facade;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import structural.facade.subsystem.PhoneProducer;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class ShopKeeperTest {

    private ShopKeeper shopKeeper;

    @Before
    public final void setup() {
        shopKeeper = new ShopKeeper();
    }

    @Test
    public final void phonePriceTest() throws Exception {
        final double expectedIphonePrice = 750;
        final double expectedSamsungPrice = 720;
        final double expectedGooglePrice = 740;
        final double delta = 0.0;

        assertEquals(expectedIphonePrice, shopKeeper.getPrice(PhoneProducer.APPLE), delta);
        assertEquals(expectedSamsungPrice, shopKeeper.getPrice(PhoneProducer.SAMSUNG), delta);
        assertEquals(expectedGooglePrice, shopKeeper.getPrice(PhoneProducer.GOOGLE), delta);
    }

    @Test
    public final void phoneModelTest() throws Exception {
        final String expectedIphoneModel = "Iphone 7";
        final String expectedSamsungModel = "Galaxy S8 Edge";
        final String expectedGoogleModel = "Pixel XL";

        assertEquals(expectedIphoneModel, shopKeeper.getPhoneModel(PhoneProducer.APPLE));
        assertEquals(expectedSamsungModel, shopKeeper.getPhoneModel(PhoneProducer.SAMSUNG));
        assertEquals(expectedGoogleModel, shopKeeper.getPhoneModel(PhoneProducer.GOOGLE));
    }
}