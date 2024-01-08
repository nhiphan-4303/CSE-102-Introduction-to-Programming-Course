//Tìm phần tử lớn thứ 2 trong dãy

import java.util.Random;
import java.util.Scanner;

public class Bai_1 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int[] a = input();
		output(a);
		System.out.println("Phan tu lon thu 2 trong day la: " + find2MaxValue(a));

	}

	public static int find2MaxValue(int[] a) {
		int max1 = a[0];
		int max2 = Integer.MIN_VALUE;

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max1 && a[i] > max2) {
				max2 = max1; // phai gan cho max 2 truoc
				max1 = a[i];

			} else if (a[i] < max1 && a[i] > max2) {
				max2 = a[i];
			}
		}
		return max2;
	}

	public static int[] input() {
		Random rd = new Random();
		System.out.println("Nhap size cua mang: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(50);

		}
		return arr;
	}

	public static void output(int[] a) {
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
	}
}
