//Calculate S(n) = 1 + 3 + 5 + … + (2k +1) with n > 0, 2k + 1 ≤ n.

import java.util.Scanner;

public class Bai_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i += 2) {
			sum += i;

		}
		System.out.println("S = " + sum);
		sc.close();
	}

}
