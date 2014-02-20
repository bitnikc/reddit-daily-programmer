package treeGeneration;

import java.util.Scanner;

public class TreeGen {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter size, trunk symbol and leaves symbol.\n"
				+ "Seperate with spaces: ");
		
		Tree tree = new Tree(
				in.nextInt(),			// base width
				in.next().charAt(0),	// trunk symbol
				in.next().charAt(0));	// leaves symbol
		
		System.out.println();
		
		tree.drawTree();

	}

}
