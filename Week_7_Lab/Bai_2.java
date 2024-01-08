//Viết hàm tính tổng các phần tử chẵn trong dãy.

import java.util.Random;
import java.util.Scanner;

public class Bai_2 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int[] a = input();
		output(a);
		int res = sumEvenEle(a);
		System.out.println(res);
	}

	public static int sumEvenEle(int[] a) {
		int sum = 0;
		for (int e : a)
			if (e % 2 == 0)
				sum += e;
		return sum;
	}

	public static int[] input() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = rd.nextInt(10);
		return arr;
	}

	public static void output(int[] a) {
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
	}
}
