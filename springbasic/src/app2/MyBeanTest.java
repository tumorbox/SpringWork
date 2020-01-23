package app2;
/*
 * oop�� ����Ǿ� �ִ� ���α׷�
 * oopƯ���� �����ϱ� ���� ����Ŭ������ �����ϰ� MyBeanStyleXXX Ŭ������ ����ϴ�
 * �Ű������� Ÿ���� ����Ÿ������ �����ϸ� �������� �����ߴ�.
 * ���Ǵ� ��ü�� ����Ǵ��� ����� ��ü�� ����ϴ� ������ �ڵ带 �����ϴ� ������ �پ���.
 * 
 * �׷��� ���� ��ü�� �����ϴ� �������� �����ؼ� �����ϰ� �ִ�.
 * ����ϴ� ��ü�� �ٲ𶧸��� ��ü�� ���� �����ϴ� �ڵ带 ��� �����ؾ� �Ѵٴ� ������ ������
 * ����ϴ� ������ ���� new�ؼ� ��ü�� �����ϴ� �ڵ�� �������� �ϴ� �ڵ�
 */

public class MyBeanTest {
	public static void main(String[] args) {
		MyBeanStyle objA = new MyBeanStyleA();
		run(objA);
		show(objA);
		
		MyBeanStyle objB = new MyBeanStyleB();
		run(objB);
		show(objB);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*********************");
		obj.hello("����");
		obj.hello("����");
		System.out.println("*********************");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("=======================");
		obj.hello("����");
		obj.hello("����");
		System.out.println("======================");
	}
}
