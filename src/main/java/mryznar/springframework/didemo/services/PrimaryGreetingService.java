package mryznar.springframework.didemo.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @Primary annotation says that if there is more than one bean - I want to use this one
 *
 * When no profile is marked as active, then it takes the one marked as ""default
 */
@Service
@Profile({"en","default"})
@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from Primary Service";
    }
}
