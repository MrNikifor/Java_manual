package patterns.structural.decorator.shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decorShape;

    public ShapeDecorator(Shape decorShape) {
        this.decorShape = decorShape;
    }

    public void draw() {
        decorShape.draw();
    }
}
