package aop.anno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Action {

	@Before("execution(* work())")
	public static void gotoOffice() {
		System.out.println("����� �մϴ�...");
	}
	
	@After("execution(* work())")
	public static void getoffOffice() {
		System.out.println("����� �մϴ�!!");
	}
	
}