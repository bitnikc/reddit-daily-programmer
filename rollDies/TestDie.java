package rollDies;

import java.util.Scanner;

public class TestDie {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Die one = new Die();
		
		do {
			System.out.println("Enter Dice Notation [NdM]: ");
			
			String[] input = in.nextLine().split("d");
			try {
				one.setAmount(input[0]);
				one.setSides(input[1]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Input did not match Dice Notation [NdM]"
						+ "\nTerminating program");
			}
			
			one.printAndRoll();
		} while(!one.isZero());
		
		in.close();
	}

}