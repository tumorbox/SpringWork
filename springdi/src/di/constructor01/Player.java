package di.constructor01;

public class Player {
	
	Dice d = new Dice();
	int totalValue=0;
	
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
