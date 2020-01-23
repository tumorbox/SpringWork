package di.constructor01.answer;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("config/bean.xml");
		AbstractPlayer p = factory.getBean("player",AbstractPlayer.class);
		p.play();
		System.out.println("���� ���� �ֻ����� ��:"+p.getTotalValue());
	}

}
