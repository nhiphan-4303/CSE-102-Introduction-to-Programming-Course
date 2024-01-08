//Tính s = 1/1! + 2/2! +...+ n/n!

import java.util.Scanner;

public class Bai_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n = sc.nextInt();
		int factorial = 1;
		double sum = 0;
		for (double i = 1; i <= n; i++) {
			factorial *= i;
			sum += (i / factorial);
		}
		System.out.println("Sum = " + sum);
		sc.close();
	}

}
