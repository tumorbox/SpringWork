package app3;
/*
 * 	�������� �̿��ؼ� ���α׷��� �����ϱ�
 * 		- new�����ڸ� �̿��ؼ� ��ü�����ϴ� �ڵ带 ���� �������� �ʴ´�. (API����)
 *		- ������ ���ο��� �����ϴ� FactoryŬ������ �̿��ؼ� ��ü�� ���޹޴´�. 
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//ApplicationContext��ü�� �����ϴ� ��
public class MyBeanTest_ApplicationContext {
	public static void main(String[] args) {
		System.out.println("**********Application������***********");
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		System.out.println("**********getBean������***********");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean1");
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*********************");
		obj.hello("����");
		obj.hello("����");
		System.out.println("*********************");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("=======================");
		obj.hello("����");
		obj.hello("����");
		System.out.println("======================");
	}
}
