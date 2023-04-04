package model;

public class Rectangle extends Shape{
    public Rectangle() {
        name = "rectangle";
    }

    @Override
    void shape() {
        System.out.println("the shape is rectangle");
    }
}
