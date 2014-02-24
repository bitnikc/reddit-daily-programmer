package guessThatNumber;

import java.util.Scanner;

public class GuessThatNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SecretNumber n1 = new SecretNumber();
		
		System.out.println("Welcome to guess-that-numbers game!\n"
				+ "I have already picked a number in [1, 100].");
		while(!n1.isCorrect()) {
			System.out.println(n1.guess(in.nextInt()));
			in.nextLine();
		}

		in.close();
	}

}
