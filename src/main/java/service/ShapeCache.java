package service;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Square;

import java.util.Hashtable;

public class ShapeCache {

    private static final Hashtable<String, Shape> shape = new Hashtable<>();

    public static Shape getShape(String id) {
        Shape mapShape = shape.get(id);
        return (Shape) mapShape.clone();
    }

    public static void load() {
        Circle circle = new Circle();
        circle.setId("1");
        shape.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shape.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shape.put(rectangle.getId(), rectangle);
    }
}
