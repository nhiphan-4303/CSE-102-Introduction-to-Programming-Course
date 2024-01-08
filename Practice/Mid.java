/*Given two positive integers A and B, assume A ≤ B. 
Write a program to count the number of prime numbers in the range [A: B]*/

import java.util.Scanner;

public class Mid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();

		long count = 0;
		boolean flag = true;
		if (a < 2) {
			a++;}
			for (long i = a; i <= b; i++) {
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
			System.out.println(count);
			sc.close();
		}
		
	}

