package book.exam.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 * Speaker
		 * 	- sony
		 * 	- apple
		 * TV
		 * 	-samsung
		 * 	-lg
		 */
		
		AbstractApplicationContext factory = 
			new GenericXmlApplicationContext("/config/bean.xml");
		TV tv = factory.getBean("samsung",TV.class);
		TV tv2 = factory.getBean("lg",TV.class);
		
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		
		tv2.turnOn();
		tv2.soundUp();
		tv2.soundDown();
		tv2.turnOff();
	
	}

}
