//Given an integer n, find the number of prime factors of n.

import java.util.Scanner;

public class PH006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		boolean flag = true;
		if (n<0)
			n=-n;
		for (int i = 2; n != 1; i++) {
			flag = true;
			while (n % i == 0) {
				n = n / i;
				if (flag) {
					count++;
					flag = false;
				}

			}

		}
		System.out.print(count);
		sc.close();

	}

}
