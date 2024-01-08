import java.util.Random;
import java.util.Scanner;

public class Bai_10 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int[] a = input();
		output(a);
		if (isEvenEle(a))
			System.out.print("Day toan la so chan");
		else
			System.out.print("Day co ton tai so le");
	}

	public static boolean isEvenEle(int[] a) {
		for (int e : a)
			if (e % 2 == 1)
				return false;
		return true;
	}

	public static int[] input() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(200);
			int t = rd.nextInt(200);
			//if (t % 2 == 1)
			//	t++;
			//arr[i]=t;
		}
		return arr;
	}

	public static void output(int[] n) {
		for (int i : n)
			System.out.print(i + " ");
		System.out.println();
	}
}
