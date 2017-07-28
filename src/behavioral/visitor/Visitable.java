package behavioral.visitor;

/**
 * @author Renat Kaitmazov
 */

public interface Visitable {
    void accept(Visitor visitor);
}
