package mryznar.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * @Services hold business logic and call method in repository layer.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String  HELLO = "Hello from Greeting Service Implementation - Original";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
