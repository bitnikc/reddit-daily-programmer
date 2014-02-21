package treeGeneration;

public class Tree {
	
	int baseWidth;
	char trunk;
	char leaves;
	
	public Tree(int baseWidth, char trunk, char leaves) {
		this.baseWidth = approvedNumber(baseWidth);
		this.trunk = trunk;
		this.leaves = leaves;
	}
	
	public void drawTree(){
		// Print the leaves
		for (int i = 1; i <= baseWidth; i+=2) {
			if (baseWidth > i)
				printSpaces((baseWidth-i)/2);
			for(int j=0;j<i;j++) System.out.print(this.leaves);
			System.out.println();
		}
		
		// Print the trunk
		printSpaces((baseWidth-3)/2);
		for(int i = 0;i<3;i++) System.out.print(trunk);
	}
	
	private void printSpaces(int spaces) {
		for(int i = 0; i<spaces; i++) System.out.print(" ");
	}
	
	private int approvedNumber(int number) {
		if (number > 21) {
			System.out.println("Width may not be larger than 21,\n"
					+ "rounding down to 21.");
			return 21;
		} else if (number < 3) {
			if (number == 2)
				System.out.println("Width must be divisable by three,\n"
					+ "rounding up to 3.");
			return approvedNumber(number+1);
		}
		else {
			if (number % 2 == 0)
				System.out.println("The width needs to be odd, rounding down to " + --number);
			return number;
		}
	}
	
}
