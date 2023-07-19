package aop.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy // aop����� 
@ComponentScan(basePackages = {"aop.java"})// �ڹٹؿ��ִ¾� �� ���
@Configuration //�����������̳ʻ��
public class Config {


}

