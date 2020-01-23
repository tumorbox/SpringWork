package di.setter01;

//Player�� ���� �ִ� Dice�� �ܺο���(�����������̳�) Injection�޾� ����ؾ� �ϹǷ� 
//Injection���� �� �ֵ��� �̸� �غ��ؾ� �Ѵ�.
//==> Constructor or Setter�޼ҵ�
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