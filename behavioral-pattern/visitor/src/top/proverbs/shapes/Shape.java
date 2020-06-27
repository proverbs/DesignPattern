package top.proverbs.shapes;

import top.proverbs.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    // visitor: double dispatch
    String accept(Visitor visitor);
}
