package patterns.structural.decorator.shape;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decorShape) {
        super(decorShape);
    }

    public void draw() {
        decorShape.draw();
         setRedBorder();
    }

    public void setRedBorder() {
        System.out.println("Red border");
    }
}
