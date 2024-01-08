//xoa 1 so x trong day

import java.util.Random;
import java.util.Scanner;

public class Ham_delete_x {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int a[] = input();
		output(a);

		System.out.println("Nhap x: ");
		int x = sc.nextInt();
		//System.out.println("Vi tri cua x la: " + index(x, a));
		a=delete(x,a);
		output(a);

	}

	public static int[] delete(int x, int[] a) {
		int[] b = new int[a.length - 1];
		int i;
		for (i = 0; i < index(x, a); i++) {
			b[i] = a[i];
		}
		for (i = index(x, a); i < b.length; i++) {
			b[i] = a[i + 1];
		}
		return b;

	}

	public static int index(int x, int[] a) {
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x)
				index = i;
		}
		return index;
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
