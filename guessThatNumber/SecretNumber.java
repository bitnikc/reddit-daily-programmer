package guessThatNumber;

public class SecretNumber {
	private int number;
	private int tries;
	private boolean correct;
	
	public SecretNumber(){
		number = randomNumber();
		tries = 0;
		correct = false;
	}
	
	public boolean isCorrect() {
		return correct;
	}

	private int randomNumber(){
		return (int)(Math.random() * 100) + 1;
	}
	
	public boolean equal(int n){
		return n == number;
	}
	
	private String wrong(int n){
		if(n<number)
			return "Incorrect! That number is smaller than my number.";
		else
			return "Incorrect! That number is bigger than my number.";
	}
	
	public String guess(int n){
		tries++;
		if(equal(n)){
			correct = true;
			return "Correct!!! It only took you " + tries + " tries!";
		}
		else
			return wrong(n);
		
	}
}
