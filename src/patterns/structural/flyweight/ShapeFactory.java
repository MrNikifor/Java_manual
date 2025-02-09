package patterns.structural.flyweight;

import java.util.HashMap;


public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String type) {
        Circle circle = (Circle) circleMap.get(type);

        if (circle == null) {
            circle = new Circle(type);
            circleMap.put(type, circle);
            System.out.println("Creating circle of type: " + type);
        }
        return circle;
    }
}
