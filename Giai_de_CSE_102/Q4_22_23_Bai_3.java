import java.util.Scanner;

public class Q4_22_23_Bai_3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
		}
		System.out.println(onlyNumber(a));
	}

	public static long onlyNumber(long[] a) {
		long res = -1;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 1) {
				res = a[i];
			}
		}
		return res;
	}
}
