package Strategy;

public class WalkPathCalculator implements PathCalculator{
    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Path Calculated by Walking from "+source+" to " +destination);
    }
}
