package Decorator;
//can only be a base  - demo
public class OrangeCone implements Dessert{
    public OrangeCone() {
    }

    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
