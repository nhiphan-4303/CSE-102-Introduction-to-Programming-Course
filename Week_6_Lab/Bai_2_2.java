//Calculate 𝑆 𝑛 = 1 + 1/1+2 + 1/1+2+3 + ⋯ + 1/1+2+3+⋯+𝑛 (n > 0).

import java.util.Scanner;

public class Bai_2_2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		System.out.println(Sn(n));

	}

	public static double Sn(int n) {
		double Sn = 0;
		for (int i = 1; i <= n; i++) {
			Sn += 1.0 / sum(i);
		}
		return Sn;
	}

	public static int sum(int i) {
		int sum = 0;
		for (int j = 1; j <= i; j++) {
			sum += j;
		}
		return sum;
	}

}
