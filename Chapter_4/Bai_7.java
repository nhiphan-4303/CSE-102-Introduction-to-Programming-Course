//Find the greatest common divisor of 2 positive integer numbers a and b.

import java.util.Scanner;

public class Bai_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number a: ");
		int a = sc.nextInt();
		System.out.println("Enter the integer number b: ");
		int b = sc.nextInt();

		int gcd = 0;

		if (a > b) {
			int temp = b;
			b = a;
			a = temp;

		}
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd + " is the greatest common divisor.");
		sc.close();
	}

}
