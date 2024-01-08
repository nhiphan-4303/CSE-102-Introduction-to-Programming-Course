/*Given two positive integers A and B, assume A ≤ B. 
Write a program to count the number of prime numbers in the range [A: B]*/

import java.util.Scanner;

public class EI_2021_Q12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number A: ");
		long A = sc.nextLong();
		System.out.println("Enter the number B: ");
		long B = sc.nextLong();

		long count = 0;
		boolean flag = true;
		long i;
		/*
		 * if (A<2) i=2; else i=A;
		 * 
		 * while (i <=B) { flag = true; for (long j = 2; j <= Math.sqrt(i); j++) { if (i
		 * % j == 0) { flag = false; break; }
		 * 
		 * } if (flag) { count++; } i++; }
		 */

		for (i = A; i <= B; i++) {
			if (i == 1) {
				flag = false;
			} else {
				flag = true;
				for (long j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}

				}
				if (flag) {
					count++;
				}
			}

		}
		System.out.println(count);
		sc.close();

	}
}
