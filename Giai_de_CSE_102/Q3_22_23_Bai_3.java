import java.util.Scanner;

public class Q3_22_23_Bai_3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long n = sc.nextInt();
		long[] a = input(n);

		output(a);

	}

	public static void output(long[] a) {
		sapXepTang(a);
		for (long x : a) {
			System.out.print(x);
		}
	}

	public static void sapXepTang(long[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					long temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

	}

	public static long[] input(long n) {
		int count = count(n);
		long[] a = new long[count];
		while (n > 0) {
			for (int i = 0; i < count; i++) {
				a[i] = n % 10;
				n = n / 10;
			}
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
