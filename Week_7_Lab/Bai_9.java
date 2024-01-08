
import java.util.Random;
import java.util.Scanner;

public class Bai_9 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int[] n = input();
		output(n);
		//int x = sc.nextInt();
		findMaxOccur(n);
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

	// hàm đếm số lần xuất hiện của X trong dãy
	public static int countX(int[] n, int x) {
		int count = 0;
		for (int i : n)
			if (i == x)
				count++;
		return count;

	}

	// hàm tìm phần tử xuất hiện nhiều lần nhất trong dãy
	public static void findMaxOccur(int[] n) {
		int value = n[0];
		int max_count = countX(n, n[0]);
		for (int i = 1; i < n.length; i++) {
			int count = countX(n, n[i]);
			if (count > max_count) {
				max_count = count;
				value = n[i];
			}
		}
		System.out.println(value);
	}

	public static void output(int[] n) {
		for (int i : n)
			System.out.print(i + " ");
		System.out.println();
	}

}
