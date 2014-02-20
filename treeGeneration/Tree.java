package treeGeneration;

public class Tree {
	
	int baseWidth;
	char trunk;
	char leaves;
	
	public Tree(int baseWidth, char trunk, char leaves) {
		this.baseWidth = baseWidth;
		this.trunk = trunk;
		this.leaves = leaves;
	}
	
	public void drawTree(){
		// Print the leaves
		for (int i = 1; i <= baseWidth; i+=2) {
			if (baseWidth > i)
				printSpaces((baseWidth-i)/2);
			printLeaves(i);
			System.out.println();
		}
		
		// Print the trunk
		printSpaces((baseWidth-3)/2);
		for(int i = 0;i<3;i++) System.out.print(trunk);
	}
	
	private void printSpaces(int spaces) {
		for(int i = 0; i<spaces; i++) System.out.print(" ");
	}
	
	private void printLeaves(int leaves) {
		for(int i=0;i<leaves;i++) System.out.print(this.leaves);
	}
	
}
