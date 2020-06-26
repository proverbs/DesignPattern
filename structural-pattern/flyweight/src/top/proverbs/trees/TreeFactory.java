package top.proverbs.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Because flyweight is aimed to share objects, it always works with factory method.
 * */
public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
