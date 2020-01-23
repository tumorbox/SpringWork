package firstexam;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("config/hr.xml");
		
		JobDAO dao = factory.getBean("jobdao",JobDAO.class);
		System.out.println("전체 레코드 수 : "+dao.count());
	}

}
