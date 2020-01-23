package book.exam01;

public class AppleSpeaker implements Speaker {
	
	public AppleSpeaker() {
		System.out.println("AppleSpeaker°´Ã¼ »ý¼º");
	}
	
	@Override
	public void soundUp() {
		System.out.println("AppleSpeakerÀÇ º¼·ý ¾÷~~~");
	}
	@Override
	public void soundDown() {
		System.out.println("AppleSpeakerÀÇ º¼·ý ´Ù¿î~~~");
	}
}
