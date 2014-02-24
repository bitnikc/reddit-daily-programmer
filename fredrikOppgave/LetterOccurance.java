package fredrikOppgave;

public class LetterOccurance implements Comparable<LetterOccurance> {
	private char letter;
	private int occurance;
	
	public LetterOccurance(char letter, String text) {
		super();
		this.letter = letter;
		this.occurance = countLetter(text);
	}

	public int getOccurance() {
		return occurance;
	}

	public char getLetter() {
		return letter;
	}
	
	public int countLetter(String text) {
		return text.length() - text.replace(String.valueOf(letter), "").length();
	}
	
	@Override
	public String toString() {
		return String.valueOf(letter) + ": " + occurance + " times.";
	}
	
	public int compareTo(LetterOccurance compareLetters) {
		return compareLetters.getOccurance() - this.occurance;
	}

}
