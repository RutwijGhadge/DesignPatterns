package Decorator;

public class Main {
    public static void main(String[] args) {
        Dessert dessert=new ChocolateScoop(new VanillaScoop(new VanillaCone()));

        System.out.println(dessert.getCost());
        System.out.println(dessert.getDescription());
    }
}

/*Decorator pattern :-
Used to avoid the class explosion problem
Has-A and IS-A -> both Relationships can be Observed
 */