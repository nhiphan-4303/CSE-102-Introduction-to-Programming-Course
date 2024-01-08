/*Write a program to count the divisors of a number.
Example: N=12
12 have 6 divisors.*/

import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number: ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		System.out.println(count + 1);
		sc.close();
	}

}
