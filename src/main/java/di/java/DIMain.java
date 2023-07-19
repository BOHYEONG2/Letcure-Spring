package di.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIMain {

	public static void main(String[] args) {
		
//		ApplicationContext context = new GenericXmlApplicationContext("di-anno.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		// ������̼� ���Ǳ׿� ȯ�ἳ���� �̿��ؼ� ����ϰ� �����Ű�, Config����Car�� ������ Config.class
		
		Car car = context.getBean("car", Car.class);
		car.printTireBrand();
		
		
		/*
		 	Tire tire = new HankookTire();
		 	Car c = new Car();
		 	c.setTire(tire)
		 */
	}
}
