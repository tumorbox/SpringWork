package di.setter01;

//Player가 갖고 있는 Dice를 외부에서(스프링컨테이너) Injection받아 사용해야 하므로 
//Injection받을 수 있도록 미리 준비해야 한다.
//==> Constructor or Setter메소드
public class Player implements AbstractPlayer {
	
	AbstractDice d;
	int totalValue=0;
	
	public Player() {}
	
	public AbstractDice getD() {
		return d;
	}
	public void setD(AbstractDice d) {
		this.d = d;
	}
	public Player(AbstractDice d) {
		super();
		this.d = d;
		
	}
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}