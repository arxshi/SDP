package visitor.shape;

import visitor.Visitor;

public interface Shape {
    void accept(Visitor visitor);
}
