// them, xoa phan tu 

import java.util.Random;
import java.util.Scanner;

public class Ham_them {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int[] arr = input();
		output(arr);
		System.out.println("Phan tu muon xoa: ");
		int n = sc.nextInt();
		//System.out.println("Vi tri muon xoa: ");
		//int k = sc.nextInt();

		//arr = delete_1(k,n,arr);
		arr = delete_2(n,arr);
		output(arr);

	}
	public static int[] delete_2(int n, int[] a) {
		n = indexN(n,a);
		int i;
		int b[] = new int[a.length - 1];
		for (i = 0; i < n; i++) {
			b[i] = a[i];
		}
		for (i = n; i < a.length - 1; i++) {
			b[i] = a[i + 1];
		}
		return b;

	}
	public static int indexN(int n, int []a) {
		int i;
		for (i = 0; i < a.length; i++) {
			if (a[i] == n) {
				return i;
			}
		}
		return i;
	}

	public static int[] delete_1(int k, int n, int[] a) {
		int i;
		int b[] = new int[a.length - 1];
		for (i = 0; i < k; i++) {
			b[i] = a[i];
		}
		for (i = k; i < a.length - 1; i++) {
			b[i] = a[i + 1];
		}
		return b;

	}

	public static int[] add(int k, int n, int[] a) {
		int b[] = new int[a.length + 1];
		int i;
		for (i = 0; i < k; i++) {
			b[i] = a[i];
		}
		b[k] = n;
		for (i = k + 1; i < a.length + 1; i++) {
			b[i] = a[i - 1];

		}
		return b;

	}

	public static void output(int[] a) {
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static int[] input() {
		System.out.println("Nhap size cua mang: ");
		int size = sc.nextInt();

		int[] a = new int[size];

		for (int i = 0; i < size; i++) {
			a[i] = rd.nextInt(100);
		}
		return a;
	}

}
