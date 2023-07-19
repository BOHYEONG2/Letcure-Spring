package di.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIMain {

	public static void main(String[] args) {
		
//		ApplicationContext context = new GenericXmlApplicationContext("di-anno.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		// 어노테이션 컨피그에 환결설정을 이용해서 사용하고 싶은거고, Config에서Car를 읽으니 Config.class
		
		Car car = context.getBean("car", Car.class);
		car.printTireBrand();
		
		
		/*
		 	Tire tire = new HankookTire();
		 	Car c = new Car();
		 	c.setTire(tire)
		 */
	}
}
