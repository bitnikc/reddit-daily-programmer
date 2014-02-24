package fredrikOppgave;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FredriksOppgave {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text;
		List<LetterOccurance> letters = new ArrayList<LetterOccurance>();
		
		System.out.println("Write a text to analyze");
		text = in.nextLine();
		
		while(!text.isEmpty()) {
			letters.add(new LetterOccurance(text.charAt(0),text));
			text = text.replace(String.valueOf(text.charAt(0)), "");
		}
		
		Collections.sort(letters);
		
		for(LetterOccurance l : letters)
			System.out.println(l);
		
		in.close();
	}

}
