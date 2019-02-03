package mryznar.springframework.didemo;

import mryznar.springframework.didemo.controllers.ConstructorInjectionController;
import mryznar.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectionControllerTest {
    private ConstructorInjectionController constructorInjectionController;

    @Before
    public void setUp(){
        this.constructorInjectionController = new ConstructorInjectionController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO,constructorInjectionController.sayHello());
    }

}
