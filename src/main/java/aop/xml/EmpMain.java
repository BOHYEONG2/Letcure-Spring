package aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * SPRING AOP 특징1
 * 1. Runtime 기반
 * 2. Proxy 기반
 * 3. interface 기반
 */

public class EmpMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("aop-xml.xml");
		
		// 타입을 인터페이스에 적용할 수 있는 Employee로 바꿔야함 Programmer가 아니라
		Employee programmer = context.getBean("programmer", Employee.class);
		programmer.work();
		
		Employee designer = context.getBean("designer", Employee.class);
		designer.work();
	
		
	}

}
