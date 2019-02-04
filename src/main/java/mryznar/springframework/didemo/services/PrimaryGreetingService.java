package mryznar.springframework.didemo.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @Primary annotation says that if there is more than one bean - I want to use this one
 */
@Service
@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from Primary Greeting Service";
    }
}
