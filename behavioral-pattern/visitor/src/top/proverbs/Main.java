package top.proverbs;

import top.proverbs.shapes.*;
import top.proverbs.visitor.XMLExportVisitor;

/**
 * Override can do the same thing, but it might bring in too much modification to the original classes.
 * Overload cannot do it! Refer https://refactoring.guru/design-patterns/visitor-double-dispatch for more details.
 * In short, overload is using static binding.
 * */
public class Main {

    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}
