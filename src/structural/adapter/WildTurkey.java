package structural.adapter;

/**
 * @author Renat Kaitmazov
 */

public final class WildTurkey implements Turkey {

    @Override
    public final void gobble() {
        System.out.println("Gobble-gobble");
    }

    @Override
    public final void fly() {
        System.out.println("I am flying a short distance");
    }
}
