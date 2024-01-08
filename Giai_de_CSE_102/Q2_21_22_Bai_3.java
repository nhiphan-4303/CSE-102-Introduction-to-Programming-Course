import java.util.Scanner;

public class Q2_21_22_Bai_3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();

		int[] a = input(n);
		System.out.println(countPrime(a));

	}

	public static int countPrime(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				count++;
			}
		}
		return count;
	}

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int[] input(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

}
