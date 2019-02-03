package mryznar.springframework.didemo;

import mryznar.springframework.didemo.controllers.SetterInjectionController;
import mryznar.springframework.didemo.services.GreetingService;
import mryznar.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectionControllerTest {

    private SetterInjectionController setterInjectionController;


    @Before
    public void setUp(){
        this.setterInjectionController = new SetterInjectionController();
        this.setterInjectionController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO,setterInjectionController.sayHello());
    }
}
