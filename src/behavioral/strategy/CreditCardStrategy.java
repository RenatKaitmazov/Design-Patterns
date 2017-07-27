package behavioral.strategy;

/**
 * @author Renat Kaitmazov
 */

public final class CreditCardStrategy implements PaymentStrategy {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final String name;
    private final String number;
    private final String cvvCode;
    private final String expiredAtDate;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public CreditCardStrategy(String name, String number, String cvvCode, String expiredAtDate) {
        this.name = name;
        this.number = number;
        this.cvvCode = cvvCode;
        this.expiredAtDate = expiredAtDate;
    }

    /*--------------------------------------------------------*/
    /* Getters
    /*--------------------------------------------------------*/

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getCvvCode() {
        return cvvCode;
    }

    public String getExpiredAtDate() {
        return expiredAtDate;
    }

    /*--------------------------------------------------------*/
    /* PaymentStrategy implementation
    /*--------------------------------------------------------*/

    @Override
    public final void pay(double amount) {
        final String cardName = name.toUpperCase();
        final int numberLength = number.length();
        final String lastDigitsOfNumber = number.substring(numberLength - 4, numberLength);
        System.out.format("Paid %.2f with %s ************%s\n", amount, cardName, lastDigitsOfNumber);
    }
}
