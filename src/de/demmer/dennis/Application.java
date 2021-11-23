package de.demmer.dennis;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Util util = new Util();
		util.count(5);
		System.out.println(util.fakultät(5));
		
		int breite = 6;
		int höhe = 4;
		util.printField(breite, höhe);
		util.printUneven(50);
		
		

		Scanner scanner = new Scanner(System.in);
		while (true) {
			String eingabe = scanner.next();

			// Anmerkung: 
			// Strings werden natürlich mit equals verglichen! 
			// Außerdem habe ich hier noch ein else statement eingefügt damit wir nach der eingabe von 'exit' nichts mehr in der Konsole ausgegeben bekommen
		
			if (eingabe.equals("exit")) {
				// Scanner nach Benutzung schließen
				scanner.close();
				break;
			} else {
				System.out.println("Wir haben : " + eingabe + "  eingegeben");
			}
		}

	}

}
