import java.util.Random;
import java.util.Scanner;

public class Bai_5 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int[] n = Input();
		output(n);
		int res = max(n);
		System.out.print(res);
	}

	public static int max(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static int[] Input() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 1; i < arr.length; i++)
			arr[i] = rd.nextInt(10);
		return arr;
	}

	public static void output(int[] n) {
		for (int i : n)
			System.out.print(i + " ");
		System.out.println();
	}
}
