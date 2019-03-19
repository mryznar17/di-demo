package mryznar.springframework.didemo.config;

import mryznar.springframework.didemo.services.GreetingService;
import mryznar.springframework.didemo.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
public class GreetingServiceConfig {

    @Bean
    public GreetingServiceFactory createGreetingServiceFactory(){
        return new GreetingServiceFactory();
    }

    @Bean
    @Primary
    @Profile("de")
    public GreetingService createGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile({"en","default"})
    public GreetingService createEnglishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    public GreetingService createSpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("es");
    }
}
