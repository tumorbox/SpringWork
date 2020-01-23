package di.constructor02;

public class LogicImpl implements Logic {
	//기본생성자
	public LogicImpl() {
		System.out.println("LogicImpl 생성");
	}
	@Override
	public void testlogic() {
		System.out.println("db연동, xml파싱, json파싱, 기타 비지니스 로직 구현");
	}

}
