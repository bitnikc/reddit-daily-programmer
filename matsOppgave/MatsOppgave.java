package matsOppgave;

import java.util.ArrayList;
import java.util.Scanner;

public class MatsOppgave {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		
		do {
			System.out.print("Skriv in ett navn eller avslutt med <ENTER>: ");
			name.add(in.nextLine());
			if (name.get(name.size()-1).isEmpty()){
				name.remove(name.size()-1);
				break;
			}
		} while (true);
		
		for (int i=0;i<20;i++)
			System.out.println(name.get((int)(Math.random()*name.size())) + " vant!!");

	}

}
