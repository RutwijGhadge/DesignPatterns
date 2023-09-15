package Strategy;

public class BikePathCalculator implements PathCalculator{

    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Path Calculated on Bike from "+source+" to "+destination);
    }
}
