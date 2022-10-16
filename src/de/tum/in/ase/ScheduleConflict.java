package de.tum.in.ase;

import java.util.Scanner;

public class ScheduleConflict {

	// TODO: implement Parts 1-4 here
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the last day: ");
		int lastDay = scanner.nextInt();
		System.out.println("Enter the modulus: ");
		int modulus = scanner.nextInt();
		System.out.println("Enter the base: ");
		int base = scanner.nextInt();

		// close scanner to avoid resource leak
		scanner.close();

	}

}
