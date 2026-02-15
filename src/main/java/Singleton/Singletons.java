package Singleton;

public class Singletons{
    private static Singletons instance = null;

    private Singletons(){
        //private constructor cannot be called from outside of the class
    }

    public static Singletons getInstance(){
        if(instance==null){
            synchronized (Singletons.class){  //class level lock
                if(instance==null){
                    instance=new Singletons();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        Singletons x=Singletons.getInstance();
        System.out.println("Object Reference: "+x.hashCode());

        Singletons y=Singletons.getInstance();
        System.out.println("Object Reference: "+y.hashCode());

    }
}