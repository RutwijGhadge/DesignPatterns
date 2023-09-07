package Prototype_and_Registry;

public interface Prototype <T>{
    T clone();
}

/*Instead of keeping a single object that can be cloned -> prototype
 we can create a registry of multiple prototype objects against some keys -> registry
 small extension of prototype objects
 */