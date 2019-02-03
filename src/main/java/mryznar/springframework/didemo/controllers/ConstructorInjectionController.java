package mryznar.springframework.didemo.controllers;

import mryznar.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {
    private GreetingService greetingService;

    /**
     * We don't need to add @Autowired annotation here as since Spring 4.2
     * automatic wiring of constructor based components is enabled
     * @param greetingService
     */
    public ConstructorInjectionController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
