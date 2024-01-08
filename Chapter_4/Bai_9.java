//Input a positive integer number N. Print out prime numbers from 2 to N

import java.util.Scanner;

public class Bai_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer number: ");
		int n = sc.nextInt();
		
		boolean prime = true;
		
		for (int i = 2; i < n; i++) {
			prime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}

			}
			if (prime) {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}

}
