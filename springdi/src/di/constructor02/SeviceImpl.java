package di.constructor02;

public class SeviceImpl implements Service {
	Logic mylogic;
	String name;
	String msg;
	
	
	public SeviceImpl(Logic mylogic, String name, String msg) {
		super();
		this.mylogic = mylogic;
		this.name = name;
		this.msg = msg;
		System.out.println("ServiceImpl�� �Ű����� 3�� ������");
	}

	@Override
	public void test() {
		// Logic�� �޼ҵ带 ȣ���ϴ� �޼ҵ�
		System.out.println(msg+","+name);
		mylogic.testlogic();

	}

}
