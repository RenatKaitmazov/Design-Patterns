package structural.facade.subsystem;

/**
 * @author Renat Kaitmazov
 */

public final class IphoneShop implements PhoneShop {

    @Override
    public String getPhoneModel() {
        return "Iphone 7";
    }

    @Override
    public double getPhonePrice() {
        return 750;
    }
}
