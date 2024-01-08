import java.util.Scanner;

public class Bai_3_1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long n = sc.nextLong();

		check(n);

	}

	public static void check(long n) {
		boolean flag = true;
		while (n > 0) {
			if (isPrime(n)) {
				flag = true;
			} else {
				flag = false;
				break;
			}
			n /= 10;
		}
		if (flag) {
			System.out.println("Yes");
		} else
			System.out.println("No");
	}

	public static boolean isPrime(long n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
