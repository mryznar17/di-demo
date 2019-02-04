package mryznar.springframework.didemo.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @Primary annotation says that if there is more than one bean - I want to use this one
 */
@Service
@Profile("en")
@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from Primary Service";
    }
}
