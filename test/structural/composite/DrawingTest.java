package structural.composite;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class DrawingTest {

    private Drawing drawing;

    @Before
    public final void setup() {
        drawing = new Drawing();
    }

    @Test
    public final void drawShapeTest() throws Exception {
        final Shape square = new Square();
        final Shape circle = new Circle();
        drawing.addShape(square);
        drawing.addShape(circle);

        drawing.draw("Red");
        drawing.draw("Green");
    }
}