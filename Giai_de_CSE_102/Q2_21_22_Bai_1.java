import java.util.Scanner;

public class Q2_21_22_Bai_1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long n = sc.nextLong();
		long[] a = input(n);
		unique(a);

	}

	public static void unique(long[] a) {
		boolean flag = true;
		//int count = 0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					flag=false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("YES");
		} else
			System.out.println("NO");

	}

	public static long[] input(long n) {
		long[] a = new long[count(n)];
		for (int i = 0; i < a.length; i++) {
			a[i] = n % 10;
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
