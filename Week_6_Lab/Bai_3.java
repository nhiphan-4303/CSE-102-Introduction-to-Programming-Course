
/*Print the greatest common divisor and least common multiple of two 
 *integer number a, b (a, b ≥ 0).*/

import java.util.Scanner;

public class Bai_3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("The greatest common divisor is: " + greatestCommonDivisor(a, b));
		System.out.println("The least common multiple is: " + leastCommonMultiple(a, b));

	}

	public static int greatestCommonDivisor(int a, int b) {
		int max = a;
		if (b > a)
			max = b;
		int i;
		for (i = max; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return i;
	}

	public static int leastCommonMultiple(int a, int b) {
		int max = a;
		if (b > a)
			max = b;
		int i = max;
		while (a > 0) {
			if (i % a == 0 && i % b == 0) {
				return i;
			}
			i++;
		}
		return i;

	}
}
