//Write a program that accepts a positive integer number from the user, and check whether it is a prime number.

import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer number: ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				count++;

		}
		if (count == 0)
			System.out.println(n + " is a prime.");
		else
			System.out.println(n + " is  not a prime.");
		sc.close();
		
	}

}
