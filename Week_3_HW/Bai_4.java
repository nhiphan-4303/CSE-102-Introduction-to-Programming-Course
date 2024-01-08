//Tính S = 1/2 + 2/3 + 3/4 +...+ n/n+1;

import java.util.Scanner;

public class Bai_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n = sc.nextInt();
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print(i + "/" + (i + 1) + " + ");
			double numerator = i;
			double denominator = (i + 1);
			sum += numerator / denominator;
		}
		System.out.println(" = " + sum);
		sc.close();

	}

}
