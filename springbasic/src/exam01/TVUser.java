package exam01;

public class TVUser {
	public static void main(String[] args) {
		TV smtv = new SamsungTV();
		smtv.turnOn();
		smtv.soundUp();
		smtv.soundDown();
		smtv.turnOff();
		
		LgTV lgtv = new LgTV();
		lgtv.turnOn();
		lgtv.soundUp();
		lgtv.soundDown();
		lgtv.turnOff();
	}

}
