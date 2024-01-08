import java.util.Scanner;

public class Q2_22_23_Bai_2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		long m = sc.nextLong();
		int[] a = input(n);

		System.out.println(max(m, a));

	}

	public static int max(long m, int[] a) {
		int max = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= m && a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static int[] input(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

}
