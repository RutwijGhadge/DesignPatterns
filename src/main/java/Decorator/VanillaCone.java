package Decorator;

//Can used as both base and Addon
public class VanillaCone implements Dessert{
    private Dessert dessert;

    public VanillaCone(Dessert dessert){//if the vanilla cone acts as a Addon
        this.dessert=dessert;
    }
    public VanillaCone() {//if the vanilla cone is a base
    }


    @Override
    public int getCost() {
        if(dessert==null)//just a base
            return 25;
        else
            return dessert.getCost()+25;//Addon
    }

    @Override
    public String getDescription() {
        if(dessert==null)//just a base
            return "Vanilla Cone";
        else            //Addon
            return dessert.getDescription()+" Vanilla Cone ";
    }
}
