import java.util.Scanner;

public class Bai_3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long n = sc.nextLong();

		long a[] = input(n);
		//if (isPrime(n)) {
		//isPrime(n);

			check(a);
		//} else
			//System.out.println("No");

	}

	public static void check(long[] a) {
		// long result = 0;
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			// result = result * 10 + a[i];
			if (!isPrime(a[i])) {
				flag = false;
				break;
			}
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

	public static long[] input(long n) {
		long[] a = new long[count(n)];
		for (int i = 0; i < a.length; i++) {

			a[i] = n;
			n /= 10;

		}
		return a;
	}

	public static int count(long n) {
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;
	}

}
