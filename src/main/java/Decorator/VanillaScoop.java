package Decorator;

public class VanillaScoop implements Dessert{//can only be the addon
    private Dessert dessert;

    public VanillaScoop(Dessert dessert) {
        this.dessert=dessert;
    }

    @Override
    public int getCost() {//no need for null check a the base will already be Present
        return dessert.getCost()+30;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription()+" VanillaScoop ";
    }
}
