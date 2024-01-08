//Input a positive integer number N. Print out the first N primes.

import java.util.Scanner;

public class Bai_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên dương n: ");

		long n = sc.nextLong();
		long m = n * 100;
		long count = 0;
		boolean flag = true;

		for (long i = 2; i < m; i++) {
			flag = true;
			for (long j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(i);
				count++;
			}
			if (count == n) {
				break;
			}

		}
		sc.close();

	}

}
