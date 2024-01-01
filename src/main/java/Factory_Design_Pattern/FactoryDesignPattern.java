package Factory_Design_Pattern;

//Client Code
public class FactoryDesignPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();

        //get an object of the circle and call its draw method
        Shape circle=shapeFactory.getShape("Circle");
        if(circle!=null)
            circle.draw();

        //get an object of the rectangle and call its draw method
        Shape rectangle=shapeFactory.getShape("Rectangle");
        if(rectangle!=null)
            rectangle.draw();

        //get an object of the triangle and call its draw method
        Shape triangle=shapeFactory.getShape("Triangle");
        if(triangle!=null)
            triangle.draw();
    }
}

/*
In this example:
The Shape interface declares a method draw() that all shapes will implement.
Circle, Square, and Rectangle are concrete implementations of the Shape interface,
each providing its own implementation of the draw() method.
The ShapeFactory class contains a method getShape() that takes a string parameter
and returns the corresponding shape object based on the input provided by the client.
The FactoryPatternExample class demonstrates how to use the ShapeFactory to create objects of different shapes.
This pattern provides flexibility by allowing the client code to use the factory
to create objects without knowing the specific class of the object being created,
making the code more maintainable and easier to extend in the future when adding new shapes or classes.
 */