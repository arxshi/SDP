package visitor;

import visitor.shape.Circle;
import visitor.shape.Rectangle;
import visitor.shape.Triangle;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Triangle triangle);
}
