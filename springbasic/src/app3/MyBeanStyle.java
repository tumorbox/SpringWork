package app3;
//���� �������̽��� �ۼ��Ѵ�.
public abstract class MyBeanStyle {
	public abstract void hello(String name);
	
	//��ü�� ������ �� �� �� ȣ��Ǵ� �޼ҵ�
	public void myInit() {
		System.out.println("init....");
	}
	
	//��ü�� �Ҹ�� �� �ѹ� ȣ��Ǵ� �޼ҵ�
	public void myDestry() {
		System.out.println("destroy..");
	}
	

}
