package top.proverbs.cache;

import top.proverbs.shapes.Circle;
import top.proverbs.shapes.Rectangle;
import top.proverbs.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle(5, 7, "green", 45);

        Rectangle rectangle = new Rectangle(6, 9, "blue", 8, 10);

        cache.put("Big green circle", circle);
        cache.put("Medium blue rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
