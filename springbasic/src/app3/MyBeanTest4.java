package app3;
/*
 * 	스프링을 이용해서 프로그램을 실행하기
 * 		- new연산자를 이용해서 객체생성하는 코드를 직접 정의하지 않는다. (API제외)
 *		- 스프링 내부에서 제공하는 Factory클래스를 이용해서 객체를 전달받는다. 
 *
 */

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanTest4 {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		//기본 설징이 singleton이므로 getBean을 세 번 호출해도 MyBeanStlyeB객체 한개만 생성되어 호출된다.
		//따라서 init도 한번만 호출된다.
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean2");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean2");
		MyBeanStyle obj3 = (MyBeanStyle)factory.getBean("myBean2");
		
		run(obj1);
		show(obj1);
		
		//컨테이너에 의해 생성된 객체가 소멸되는 시점은 컨테이너가 소멸될 때
		factory.close();
	
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
