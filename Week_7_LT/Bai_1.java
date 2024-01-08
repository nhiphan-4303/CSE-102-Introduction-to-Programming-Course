import java.util.Random;
import java.util.Scanner;

public class Bai_1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = input();
		output(a);
		System.out.println();
		sapXepChan(a);
		output(a);

	}

	public static void sapXepChan(int[] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] % 2 == 1 && a[j] % 2 == 0) 
					|| (a[i] % 2 == 0 && a[j] % 2 == 0 && a[i] > a[j])
					|| (a[i] % 2 == 1 && a[j] % 2 == 1 && a[i] < a[j]))

				{
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
	}

	public static void sapXepGiam(int[] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++)
				if (a[i] < a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
	}

	public static void sapXepTang(int[] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++)
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
	}

	public static int[] input() {
		Random rd = new Random();
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(50);

		}
		return arr;
	}

	public static void output(int[] n) {
		for (int i : n)
			System.out.print(i + " ");
		System.out.println();
	}

}
