package mryznar.springframework.didemo.controllers;

import mryznar.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @Controller annotation makes this class a Spring component which will be managed by spring context.
 * So when Spring starts up he'll get a handle on this, create instance of it and put it into the spring context.
 *
 * @Controller annotation indicates that a particular class serves the role of a controller.
 * You cannot switch this annotation with any other like @Service or @Repository, even though they look same.
 * The dispatcher scans the classes annotated with @Controller and detects @RequestMapping annotations within them.
 * You can only use @RequestMapping on @Controller annotated classes.
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
