package Decorator;
//Can Only be Addon
public class ChocolateScoop implements Dessert{

    private final Dessert dessert;
    public ChocolateScoop(Dessert dessert) {
        this.dessert=dessert;
    }

    @Override
    public int getCost() {
        return dessert.getCost()+40;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription()+" ChocolateScoop ";
    }
}
