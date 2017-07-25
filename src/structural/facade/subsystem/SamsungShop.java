package structural.facade.subsystem;

/**
 * @author Renat Kaitmazov
 */

public final class SamsungShop implements PhoneShop {

    @Override
    public String getPhoneModel() {
        return "Galaxy S8 Edge";
    }

    @Override
    public double getPhonePrice() {
        return 720;
    }
}
