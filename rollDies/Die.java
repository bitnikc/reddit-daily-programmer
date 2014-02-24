package rollDies;

public class Die {
	private int sides;
	private int amount;
	
	public Die(){
		sides = 0;
		amount = 0;
	}

	public void setSides(String sides) {
		this.sides = Integer.parseInt(sides);
	}

	public void setAmount(String amount) {
		this.amount = Integer.parseInt(amount);
	}

	public int roll(){
		return (int)(Math.random() * sides) + 1;
	}
	
	public void printAndRoll() {
		for (int i = 0; i < amount; i++)
			System.out.println("Roll number " + (i+1) + ": " + this.roll());
	}
	
	public boolean isZero(){
		return (sides == 0 || amount == 0);
	}
}
