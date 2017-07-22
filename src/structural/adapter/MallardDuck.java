package structural.adapter;

/**
 * @author Renat Kaitmazov
 */

public final class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack-quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
