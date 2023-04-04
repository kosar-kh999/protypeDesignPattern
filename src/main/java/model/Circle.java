package model;

public class Circle extends Shape {
    public Circle() {
        name = "circle";
    }

    @Override
    void shape() {
        System.out.println("the shape is circle");
    }
}
