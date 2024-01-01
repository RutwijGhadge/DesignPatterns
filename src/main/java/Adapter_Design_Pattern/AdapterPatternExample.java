package Adapter_Design_Pattern;
//client code
public class AdapterPatternExample {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        // Using the adapter to make Rectangle compatible with Shape interface
        Shape adaptedRectangle = new RectangleAdapter(rectangle);

        // Calling methods defined in Shape interface
        adaptedRectangle.getShape();
        double area = adaptedRectangle.getArea();
        System.out.println("Area of the rectangle: " + area);

    }
}


/*
Rectangle represents a class with incompatible methods that need to be adapted.
Shape is the interface that the client expects.
RectangleAdapter acts as the adapter that implements the Shape interface and contains an instance of Rectangle.
The RectangleAdapter's methods (getArea() and getShape()) adapt the Rectangle methods to match the Shape interface.
 */