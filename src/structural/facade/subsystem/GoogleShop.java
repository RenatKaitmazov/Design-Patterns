package structural.facade.subsystem;

/**
 * @author Renat Kaitmazov
 */

public final class GoogleShop implements PhoneShop {

    @Override
    public String getPhoneModel() {
        return "Pixel XL";
    }

    @Override
    public double getPhonePrice() {
        return 740;
    }
}
