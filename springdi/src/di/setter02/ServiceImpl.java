package di.setter02;

public class ServiceImpl implements Service {
	Logic mylogic;		//Setter Injection
	String name;		//Constructor Injection
	String msg;			//Constructor Injection
	
	//�⺻������
	public ServiceImpl() {
		System.out.println("SeviceImpl ����");
	}
	
	public Logic getMylogic() {
		return mylogic;
	}

	public void setMylogic(Logic mylogic) {
		this.mylogic = mylogic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public ServiceImpl(String name, String msg) {
		super();
		this.name = name;
		this.msg = msg;
		System.out.println("ServiceImpl�� �Ű����� 2�� ������");
	}

	public ServiceImpl(Logic mylogic, String name, String msg) {
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
