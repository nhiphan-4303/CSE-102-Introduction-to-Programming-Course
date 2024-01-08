//Tính S = 1/2 + 1/3 + 1/4 +...+ 1/n

import java.util.Scanner;

public class Bai_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n = sc.nextInt();
		double sum = 0;
		for (double i = 1; i <= n; i++) {
			sum += 1 / i;

		}
		System.out.println("S = " + sum);
		sc.close();

	}

}
