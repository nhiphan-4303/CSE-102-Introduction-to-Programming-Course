//ham them x vao vi tri k trong day
//ham them x vao sau vi tri co phan tu nho nhat nho nhat trong day

import java.util.Random;
import java.util.Scanner;

public class Add_x_into_minIndex {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int a[] = input();
		output(a);
		System.out.println("Vi tri co phan tu nho nhat trong day la: " + minIndex(a));
		System.out.println("Nhap x: ");
		int x= sc.nextInt();
		
		//System.out.println(insertMinIndex(x, a));
		a = insertMinIndex(x,a);
		output(a);

	}
	public static int[] insertMinIndex(int x, int[] a) {
		int[] b = new int[a.length + 1];
		int i;
		
		for (i = 0; i < minIndex(a) + 1; i++) {
			b[i] = a[i];
		}
		b[minIndex(a)+1] = x;
		for (i = minIndex(a) + 2; i < b.length; i++) {
			b[i] = a[i - 1];
		}
		return b;

	}
	public static int minIndex(int[]a) {
		int index=0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i<a.length;i++) {
			if (a[i]<min) {
				min = a[i];
				index=i;
			}
		}
		return index;
	}

	public static int[] insert(int x, int k, int[] a) {
		int[] b = new int[a.length + 1];
		// copy
		int i;
		for (i = 0; i < k; i++) {
			b[i] = a[i];
		}
		b[k] = x;
		for (i = k + 1; i < b.length; i++) {
			b[i] = a[i - 1];
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
