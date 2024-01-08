//Calculate P(x, y) = x y with y ≥ 0. Note: do not use the Math.pow() method.

import java.util.Scanner;

public class Bai_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		long pow = 1;
		for (int i = 10; i < 10 + y; i++)
			pow = pow * x;
		System.out.printf("%,d", pow);
		sc.close();

	}

}
