/*Print the Fibonacci. N entered by the user
• f1= f0 = 1;
• fn = fn-1 + fn-2 ; (n>1)*/

import java.util.Scanner;

public class Bai_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f0 = 1;
		int f1 = 1;
		int fn = 0;
		for (int i = 2; i <= n; i++) {
			fn = f0 + f1;
			f0 = f1;
			f1 = fn;
		}
		System.out.println(fn);
		sc.close();

	}

}
