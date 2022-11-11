package de.tum.in.ase;

import java.util.Scanner;

public class ScheduleConflict {

	// TODO: implement Parts 1-4 here
	public static boolean divisibility(int lastDay, int modulus) {
//		return false if the method gets an invalid input
//		non-positive number or modulus as an invalid input
		if (lastDay < 0 || modulus <= 0) {
			return false;
		} else if (lastDay % modulus != 0) {
			return false;
		} else {
			return true;
		}
	}

//	checks whether a number is the power of a base
	public static boolean isBaseForNumber(int lastDay, int base) {
//		return false if:
//		1. the function gets 1 as a number.
//		2 the function gets an invalid input (e.g. 0 for base as an invalid input)
		if (lastDay == 1 || base == 0) {
			return false;
		} else {
//			check if the given base is the base of lastDay
			int number = lastDay;
			while (number >= base) {
				if (number % base == 0) {
					number /= base;
				} else {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the last day: ");
		int lastDay = scanner.nextInt();
		System.out.println("Enter the modulus: ");
		int modulus = scanner.nextInt();
		System.out.println("Enter the base: ");
		int base = scanner.nextInt();

//		for (int i = 1; i <= lastDay; i++) {
//			System.out.println("divisibility: " + i + " " + modulus + " " + divisibility(i, modulus));
//		}
//
//		for (int i = 1; i <= lastDay; i++) {
//			System.out.println("isBaseForNumber: " + i + " " + base + " " + isBaseForNumber(i, base));
//		}

		for (int i = 1; i <= lastDay; i++){
			if (divisibility(i, modulus) && isBaseForNumber(i, base)) {
				System.out.println(i + " Conflict!!");
			} else {
				if (divisibility(i, modulus)) {
					System.out.println(i + " Heilbronn");
				} else if (isBaseForNumber(i, base)) {
					System.out.println(i + " Munich");
				} else {
					System.out.println(i);
				}
			}
		}
		// close scanner to avoid resource leak
		scanner.close();
	}
}
