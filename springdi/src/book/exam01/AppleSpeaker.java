package book.exam01;

public class AppleSpeaker implements Speaker {
	
	public AppleSpeaker() {
		System.out.println("AppleSpeaker��ü ����");
	}
	
	@Override
	public void soundUp() {
		System.out.println("AppleSpeaker�� ���� ��~~~");
	}
	@Override
	public void soundDown() {
		System.out.println("AppleSpeaker�� ���� �ٿ�~~~");
	}
}
