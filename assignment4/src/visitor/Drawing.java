package visitor;

import visitor.shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private List<Shape> shapes;

    public Drawing() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void calculateArea() {
        AreaCalculator areaCalculator = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }
        System.out.println("Total Area: " + areaCalculator.getTotalArea());
    }
}

