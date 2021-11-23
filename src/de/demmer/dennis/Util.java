package de.demmer.dennis;

public class Util {

	public void count(int number) {

		for (int i = 0; i <= number; i++) {
			System.out.println(i);
		}

//		int i = 0;
//		while(i <= number) {
//			System.out.println(i);
//			i++;
//		}

	}

	public int fakultät(int number) {

		int prod = 1;

		for (int i = 1; i <= number; i++) {
			prod = prod * i;
		}

		return prod;
	}

	public void printField(int breite, int höhe) {

		for (int i = 0; i < höhe; i++) {

			for (int j = 0; j < breite; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void printUneven(int number) {
		int i = 0;
		while (i <= number) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
