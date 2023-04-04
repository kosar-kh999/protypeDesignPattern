package model;

public class Square extends Shape{
    public Square() {
        name = "square";
    }

    @Override
    void shape() {
        System.out.println("the shape is square");
    }
}

