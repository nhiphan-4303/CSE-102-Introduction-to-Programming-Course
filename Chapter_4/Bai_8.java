//Input a positive integer number N. Check if N is a prime number or not.

import java.util.Scanner;

public class Bai_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer number: ");
		int n = sc.nextInt();
		boolean prime = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}

		if (prime)
			System.out.println(n + " is a prime.");
		else
			System.out.println(n + " is not a prime.");
		sc.close();
	}

}
