/*A perfect number is a number whose sum of its
divisors (excluding itself) is equal to itself. Enter the
positive integer n and check if n is a perfect number
Example: the number 6 is a perfect number because
the sum of the divisors is 1+2+3 = 6..*/

import java.util.Scanner;

public class Bai_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; /*i < n*/ i<=n/2; i++) {
			if (n % i == 0) 
				sum += i;
	
		}
		if (sum == n)
			System.out.println(n + " is a perfect numeber");
		else
			System.out.println(n + " is not a perfect numeber");
		sc.close();
	}

}
