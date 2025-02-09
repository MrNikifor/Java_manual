package patterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle1 = shapeFactory.getCircle("Big");
        circle1.draw("Red");

        Shape circle2 = shapeFactory.getCircle("Small");
        circle2.draw("Green");

        Shape circle3 = shapeFactory.getCircle("Normal");
        circle3.draw("Blue");

        System.out.println(circle1 == circle3); // true
    }
}
