import java.util.Scanner;

public class Q4_22_23_Bai_2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		long m = sc.nextLong();
		int[] arr = input(n);
		//sapXepTang(arr);
		//output1(arr);
		output(arr, m);

	}

	public static void output(int[] a, long m) {
		int count = 0;
		int sum = 0;
		boolean flag = true;
		sapXepTang(a);
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (sum <= m) {
				System.out.print(a[i] + " ");
				count++;
				flag = false;
			}
		}
		if (flag)
			System.out.println(-1);
		else
			System.out.println(count);
	}

	public static void sapXepTang(int[] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++)
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
	}
	public static void output1(int[]a) {
		for (int x:a) {
			System.out.println(x + " ");
		}
	}

	public static int[] input(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

}
