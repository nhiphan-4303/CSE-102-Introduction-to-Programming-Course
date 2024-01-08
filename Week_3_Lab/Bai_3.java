// Calculate n!

import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n = sc.nextInt();
		int gt = 1;
		for (int i = 1; i <= n; i++) {
			gt *= i;
		}
		System.out.println("Giai thua: " + gt);
		sc.close();
	}

}
