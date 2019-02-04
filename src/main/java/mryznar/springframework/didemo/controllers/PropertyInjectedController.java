package mryznar.springframework.didemo.controllers;

import mryznar.springframework.didemo.services.GreetingService;
import mryznar.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    /**
     * In this case Spring doesn't need the Qualifier to pick proper bean implementation as it uses property name and
     * reflection to chose proper implementation
     * It is not proposed solution. It's better to use @Qualifier to express Your intent better
     */
    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}
