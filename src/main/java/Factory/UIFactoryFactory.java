package Factory;

public class UIFactoryFactory {
    public static UIFactory getUiFactory(SupportedPlatforms platforms){
        return switch(platforms){
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IOSUIFactory();
        };
    }
}

//UIFactory -> Creates the Objects/UI elements Button,Menu,DropDown etc
//UIFactoryFactory -> Creates the Objects of UIFactory,AndroidFactory,IOSFactory etc
