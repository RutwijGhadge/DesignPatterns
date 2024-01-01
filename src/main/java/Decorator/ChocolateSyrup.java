package Decorator;
//as a addon
public class ChocolateSyrup implements Dessert{
    private Dessert dessert;
    public ChocolateSyrup(Dessert dessert) {
        this.dessert=dessert;
    }

    @Override
    public int getCost() {
        return dessert.getCost()+50;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription()+" ChocolateSyrup";
    }
}
