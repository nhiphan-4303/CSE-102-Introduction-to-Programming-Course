//Write a program that accepts a positive integer number from the user, and check whether it is a prime number.

import java.util.Scanner;

public class Bai_2_cach_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer number: ");
		int n = sc.nextInt();
		boolean prime = true;
		for (int i = 2; i <= Math.sqrt(n); i++) 
			if (n % i == 0) {
				prime = false;
				break;
			}

		if (prime)
			System.out.println(n + " is a prime.");
		else
			System.out.println(n + " is not a prime.");
		sc.close();
	}

}
