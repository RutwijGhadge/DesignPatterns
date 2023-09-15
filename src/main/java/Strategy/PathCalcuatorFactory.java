package Strategy;

import Factory.AndroidUIFactory;
import Factory.IOSUIFactory;

public class PathCalcuatorFactory {
    public static PathCalculator getPathCalculator(ModeofTransport modeofTransport){
        //return type interface
        return switch(modeofTransport){//same as we use in the factory
            case CAR -> new CarPathCalculator();
            case BIKE -> new BikePathCalculator();
            case WALK -> new WalkPathCalculator();
        };
    }
}
//Strategy Design Pattern Internally uses Factory Design Pattern
