package Strategy;

public class CarPathCalculator implements PathCalculator{
    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Path Calculated on Car from "+source+" to " +destination);
    }
}
