import java.util.Scanner;

public class Q1_22_23_Bai_1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int x = sc.nextInt();

		long[] a = input(x);
		outputFindMax(a);

	}

	public static void outputFindMax(long[] a) {

		// lay tung so trong mang x
		for (int i = 0; i < a.length; i++) {
			maxValue(a[i]);
			System.out.println();
		}
	}

	public static void maxValue(long a) {
		long[] b = new long[count(a)];
		for (int i = 0; i < b.length; i++) {
			b[i] = a % 10;
			a /= 10;
		}
		sapXepGiam(b);

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}

	public static void sapXepGiam(long[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					long temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static int count(long a) {
		int count = 0;
		while (a > 0) {
			a /= 10;
			count++;

		}
		return count;
	}

	public static long[] input(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		return a;
	}

}
