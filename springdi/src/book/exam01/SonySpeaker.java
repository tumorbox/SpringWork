package book.exam01;

public class SonySpeaker implements Speaker {
	
	public SonySpeaker() {
		System.out.println("SonySpeaker��ü ����");
	}
	
	@Override
	public void soundUp() {
		System.out.println("SonySpeaker�� ���� ��~~~");
	}
	@Override
	public void soundDown() {
		System.out.println("SonySpeaker�� ���� �ٿ�~~~");
	}
}
