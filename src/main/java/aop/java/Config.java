package aop.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy // aop를사용 
@ComponentScan(basePackages = {"aop.java"})// 자바밑에있는애 다 등록
@Configuration //스프링컨테이너사용
public class Config {


}

