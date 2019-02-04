package mryznar.springframework.didemo;

import mryznar.springframework.didemo.controllers.ConstructorInjectionController;
import mryznar.springframework.didemo.controllers.MyController;
import mryznar.springframework.didemo.controllers.PropertyInjectedController;
import mryznar.springframework.didemo.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		/*
		SpringApplication.run(DiDemoApplication.class, args) loads the context
		 */
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		/*
			Spring creates bean from MyController class named with leading lowercase char with name of class
			context getBean is not strongly typed so it have to be cased
		 */
//		MyController controller = (MyController) ctx.getBean("myController ");
//		controller.hello();

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectionController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectionController.class).sayHello());
	}

}

