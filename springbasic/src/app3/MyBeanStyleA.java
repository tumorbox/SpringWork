package app3;

public class MyBeanStyleA extends MyBeanStyle{
	public MyBeanStyleA() {
		System.out.println("MyBeanStyleA�� ������");
	}
	@Override
	public void hello(String name) {
		System.out.println("�ȳ��ϼ���...,"+name);
		
	}
}
