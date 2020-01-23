package book.exam01;

public class SonySpeaker implements Speaker {
	
	public SonySpeaker() {
		System.out.println("SonySpeaker°´Ã¼ »ý¼º");
	}
	
	@Override
	public void soundUp() {
		System.out.println("SonySpeakerÀÇ º¼·ý ¾÷~~~");
	}
	@Override
	public void soundDown() {
		System.out.println("SonySpeakerÀÇ º¼·ý ´Ù¿î~~~");
	}
}
