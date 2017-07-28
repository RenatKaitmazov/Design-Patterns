package behavioral.visitor;

/**
 * @author Renat Kaitmazov
 */

public interface Visitor {
    void visit(Book book);
    void visit(Phone phone);
}
