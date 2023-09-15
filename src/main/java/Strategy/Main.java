package Strategy;

public class Main {
    public static void main(String[] args) {
        GoogleMaps googleMaps=new GoogleMaps();
        googleMaps.FindPath("Airport","Home",ModeofTransport.CAR);
        googleMaps.FindPath("Temple","Home",ModeofTransport.WALK);
    }
}
//when we have MULTIPLE WAYS to achieve the SAME outcome/Result  then we use Strategy Design Pattern