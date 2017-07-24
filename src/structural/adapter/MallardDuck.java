package structural.adapter;

/**
 * @author Renat Kaitmazov
 */

public final class MallardDuck implements Duck {

    @Override
    public final void quack() {
        System.out.println("Quack-quack");
    }

    @Override
    public final void fly() {
        System.out.println("I am flying");
    }
}
