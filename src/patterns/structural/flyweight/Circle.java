package patterns.structural.flyweight;

public class Circle implements Shape {
    private String type; // Внутреннее состояние

    public Circle(String type) {
        this.type = type;
    }

    @Override
    public void draw(String color) {
        System.out.println("Drawing " + type + " circle in " + color);
    }
}
