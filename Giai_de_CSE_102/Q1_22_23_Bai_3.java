import java.util.Scanner;

public class Q1_22_23_Bai_3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();

		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		System.out.println(output(a));
	}

	public static long output(long[] a) {
		long min = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min && a[i] % 2 != 0) {
				min = a[i];

			}
		}
		return min;
	}

}
