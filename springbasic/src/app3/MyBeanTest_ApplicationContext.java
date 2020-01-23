package app3;
/*
 * 	스프링을 이용해서 프로그램을 실행하기
 * 		- new연산자를 이용해서 객체생성하는 코드를 직접 정의하지 않는다. (API제외)
 *		- 스프링 내부에서 제공하는 Factory클래스를 이용해서 객체를 전달받는다. 
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//ApplicationContext객체를 관리하는 법
public class MyBeanTest_ApplicationContext {
	public static void main(String[] args) {
		System.out.println("**********Application생성전***********");
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		System.out.println("**********getBean생성전***********");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean1");
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*********************");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("*********************");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("=======================");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("======================");
	}
}
