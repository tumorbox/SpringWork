package app3;

public class MyBeanStyleB extends MyBeanStyle{
	
	public MyBeanStyleB() {
		System.out.println("MyBeanStyleB�� ������");
	}
	
	@Override
	public void hello(String name) {
		System.out.println("hello...,"+name);
	}
}
