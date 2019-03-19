package mryznar.springframework.didemo.services;

public class GreetingServiceFactory {

    public GreetingService createGreetingService(String lang){
        switch (lang){
            case "en":
                return new PrimaryGreetingService();
            case "es":
                return new PrimarySpanishGreetingService();
            case "de":
                return new PrimaryGermanGreetingService();
            default:
                return new PrimaryGreetingService();
        }
    }
}
