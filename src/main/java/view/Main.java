package view;

import model.Shape;
import service.ShapeCache;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ShapeCache.load();
        System.out.println("Enter id");
        String id = scanner.nextLine();
        Shape shape = ShapeCache.getShape(id);
        System.out.println(shape.getName());
    }
}
