package Singleton;

public class singleton {
    private static singleton instance=null;
    private singleton(){//private constructor is used so that object can't be created using the new keyword 
        //cannot be accessed from outside of class
    }
    public static singleton getInstance(){//can use synchronized lock here also but the performance will be slow
        if(instance==null){
            synchronized(singleton.class) {//class level lock
                if (instance == null) {
                    instance = new singleton();//private constructor called from inside the class.
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        singleton x = singleton.getInstance();

        // Instantiating Singleton class with variable y
        singleton y = singleton.getInstance();

        // Instantiating Singleton class with variable z
        singleton z = singleton.getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());
    }
}
//O/P -> only one object will be created
//since the constructor is static user can't call/create the Multiple Object
// static will allow you to invoke the private constructor without an instance of class.
//Early Instantiation: creation of instance at load time.
//Lazy Instantiation: creation of instance when required