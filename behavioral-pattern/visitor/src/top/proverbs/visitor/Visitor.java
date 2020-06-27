package top.proverbs.visitor;

import top.proverbs.shapes.Circle;
import top.proverbs.shapes.CompoundShape;
import top.proverbs.shapes.Dot;
import top.proverbs.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
