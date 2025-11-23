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

The Decorator Pattern is a structural design pattern that allows you to add new functionality to objects dynamically
without changing the original class structure.

📌 Key Points
It is used to extend functionality at runtime.
Promotes composition over inheritance.
Useful when you want to avoid creating many subclasses.

| Use When                                 | Avoid When                         |
| ---------------------------------------- | ---------------------------------- |
| You want flexible functionality addition | Too many small classes             |
| You follow open/closed principle         | Simple features that rarely change |
| Want runtime configuration               |                                    |

✔ Summary
Decorator pattern adds responsibilities dynamically
Provides flexibility vs subclass explosion
Uses wrapper classes to extend behavior

 */