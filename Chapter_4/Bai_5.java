//Calculate n!. Example: N=5 → 5! = 120.

import java.util.Scanner;

public class Bai_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		System.out.println("Factorial is: " + factorial);
		sc.close();

	}

}
