package patterns.structural.decorator.shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redSquare = new RedShapeDecorator(new Square());
        Shape redTriangle = new RedShapeDecorator(new Triangle());

        System.out.println("The usual circle");
        circle.draw();
        System.out.println("a circle with a red border");
        redCircle.draw();
        System.out.println("--------------------------------");

        System.out.println("The usual square");
        square.draw();
        System.out.println("a square with a red border");
        redSquare.draw();
        System.out.println("--------------------------------");

        System.out.println("The usual triangle");
        triangle.draw();
        System.out.println("a triangle with a red border");
        redTriangle.draw();
        System.out.println("--------------------------------");
    }
}
