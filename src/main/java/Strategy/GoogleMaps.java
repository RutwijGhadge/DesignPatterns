package Strategy;

public class GoogleMaps {
    public void FindPath(String source, String destination,ModeofTransport modeofTransport){
        PathCalculator pathCalculator=PathCalcuatorFactory.getPathCalculator(modeofTransport);
        pathCalculator.calculatePath(source,destination);
    }
}
