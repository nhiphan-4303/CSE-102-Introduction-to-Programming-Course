// S=1-2 + 3-4 +...+ (-1)**n+1*n

import java.util.Scanner;

public class Bai_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += Math.pow(-1, i + 1) * i;
		}
		System.out.println(sum);
		sc.close();

	}

}
