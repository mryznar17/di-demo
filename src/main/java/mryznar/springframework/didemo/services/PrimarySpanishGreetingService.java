package mryznar.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @Profile annotations allows to compose application for different environment.
 * In this case it was just changing language, but it might be used for example for changing
 * implementation of Queue/Database etc
 */
//@Service
//@Profile("es")
//@Primary
public class PrimarySpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola del servicio de saludo primario";
    }
}
