//Enter the length a,b,c. Examine that can a,b,c from a triangle?

import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		boolean flag = true;

		if (a + b > c && b + c > a && c + a > b)
			System.out.println(flag);
		else
			System.out.println(!flag);
		sc.close();

	}

}
