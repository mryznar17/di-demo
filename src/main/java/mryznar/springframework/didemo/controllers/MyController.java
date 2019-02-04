package mryznar.springframework.didemo.controllers;

import mryznar.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @Controller annotation makes this class a Spring component which will be managed by spring context.
 * So when Spring starts up he'll get a handle on this, create instance of it and put it into the spring context.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayGreeting();
    }
}
