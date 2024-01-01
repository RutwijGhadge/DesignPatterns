package Adapter_Design_Pattern;
/*
The Adapter Design Pattern is a structural design pattern that allows incompatible interfaces to work together.
It involves creating a wrapper class that converts the interface of one class into another interface
that the client expects. This pattern is useful when you want to use a class that doesn't quite fit
into your existing system because of its incompatible interfaces.
 */

public class RectangleAdapter implements Shape{
    Rectangle rectangle=new Rectangle();

    public RectangleAdapter(Rectangle rectangle) {
    }

    @Override

    public double getArea() {
        // Adapter's implementation of getArea by using calculateArea() from Rectangle
       double area= rectangle.CalculateArea();
        return area;
    }

    @Override
    public void getShape() {
        //Adapter's implementation of getShape by using Display() from Rectangle
        rectangle.Display();
    }
}
