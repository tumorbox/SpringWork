package book.exam01;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;


public class TVUser {
	public static void main(String[] args) {
		
		/*
		 * �����������̳ʿ� ���� �����ؼ� ��ü�� �޾� ����� �� �ֵ��� �����ϱ�
		 * Dependency Lookup����
		 * �������� : config/bean.xml
		 * �� ��� : 
		 * 			SamsungTV => samsung
		 * 			LgTV => lg
		 * 
		 * getBean���� ���ͼ� �۾��ϵ��� �ڵ� �����ϱ�
		 * 
		 * */
		
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		
		TV tv = factory.getBean("tv", TV.class);
		
	//	TV lgtv = (LgTV)factory.getBean("lg");
		
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		
	
	}

}
