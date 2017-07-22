package creational.abstractfactory;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public class AbstractShapeFactoryTest {


    private ShapeFactory circleFactory;
    private ShapeFactory triangleFactory;
    private ShapeFactory rectangleFactory;

    @Before
    public final void setup() {
        circleFactory = new CircleFactory(10);
        triangleFactory = new TriangleFactory(20, 5);
        rectangleFactory = new RectangleFactory(15, 25);
    }

    @Test
    public final void createCorrectShapeTest() throws Exception {
        final Shape circle = AbstractShapeFactory.createNewShape(circleFactory);
        final Shape triangle = AbstractShapeFactory.createNewShape(triangleFactory);
        final Shape rectangle = AbstractShapeFactory.createNewShape(rectangleFactory);

        assertEquals(StringConstants.LABEL_CIRCLE, circle.getShapeType());
        assertTrue(circle.getClass() == Circle.class);
        assertEquals(StringConstants.LABEL_TRIANGLE, triangle.getShapeType());
        assertTrue(triangle.getClass() == Triangle.class);
        assertEquals(StringConstants.LABEL_RECTANGLE, rectangle.getShapeType());
        assertTrue(rectangle.getClass() == Rectangle.class);
    }
}