package top.proverbs.shapes;

import top.proverbs.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    // visitor: double dispatch
    // different visitors can share this same interface!
    String accept(Visitor visitor);
}
