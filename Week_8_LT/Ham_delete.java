//xoa mot so o vi tri k 

import java.util.Random;
import java.util.Scanner;

public class Ham_delete {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int a[] = input();
		output(a);

		System.out.println("Nhap k: ");
		int k = sc.nextInt();
		a = delete(k, a);
		output(a);

	}

	public static int[] delete(int k, int[] a) {
		int[] b = new int[a.length - 1];
		int i;
		for (i = 0; i < k; i++) {
			b[i] = a[i];
		}
		for (i = k; i < b.length; i++) {
			b[i] = a[i + 1];
		}
		return b;

	}

	public static void output(int a[]) {
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static int[] input() {
		System.out.print("Nhap size cua mang: " + " ");
		int size = sc.nextInt();

		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = rd.nextInt(100);
		}
		return a;
	}
}
