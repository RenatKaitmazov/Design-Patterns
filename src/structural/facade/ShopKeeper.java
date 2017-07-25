package structural.facade;

import structural.facade.subsystem.*;

/**
 * @author Renat Kaitmazov
 */

public final class ShopKeeper {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final PhoneShop iphoneShop;
    private final PhoneShop samsungShop;
    private final PhoneShop googleShop;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public ShopKeeper() {
        iphoneShop = new IphoneShop();
        samsungShop = new SamsungShop();
        googleShop = new GoogleShop();
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public final double getPrice(PhoneProducer producer) {
        final double price;
        switch (producer) {
            case APPLE:
                price = iphoneShop.getPhonePrice();
                break;
            case SAMSUNG:
                price = samsungShop.getPhonePrice();
                break;
            case GOOGLE:
                price = googleShop.getPhonePrice();
                break;
            default:
                throw new IllegalArgumentException("Unknown phone producer.");
        }
        return price;
    }

    public final String getPhoneModel(PhoneProducer producer) {
        final String phoneModel;
        switch (producer) {
            case APPLE:
                phoneModel = iphoneShop.getPhoneModel();
                break;
            case SAMSUNG:
                phoneModel = samsungShop.getPhoneModel();
                break;
            case GOOGLE:
                phoneModel = googleShop.getPhoneModel();
                break;
            default:
                throw new IllegalArgumentException("Unknown phone producer.");
        }
        return phoneModel;
    }
}
