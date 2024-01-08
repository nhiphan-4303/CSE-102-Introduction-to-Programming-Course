//Bài 12,13 và 14
import java.util.Random;
import java.util.Scanner;

public class Bai_12 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int[] a = input();
		output(a);
		System.out.println();
		
		int x = sc.nextInt();
		findX(a, x);
		
		khoangCach(a, x);
	}

	public static void khoangCach(int[] a, int x) {
		int count = countX(a, x);
		if (count == 0) {
		int value = a[0];
		int min_gap = Math.abs(a[0] - x);
		
			for (int i = 1; i < a.length; i++) {
				int gap = Math.abs(a[i] - x);
				if (min_gap > gap) {
					min_gap = gap;
					value = a[i];
				} else {
					if (gap == min_gap && a[i] < value)
						value = a[i];
				}
			}
			System.out.println("Phan tu x la: " + value);
		}
	}

	public static int countX(int[] a, int x) {
		int count = 0;
		for (int i : a)
			if (i == x)
				count++;
		return count;
	}

	public static void findX(int[] a, int x) {
		int count = countX(a, x);
		if (count > 0) {
			if (count == 1)
				System.out.println("có " + x + " trong day ");
			else
				System.out.println(count);
		} else {// count==0
			System.out.println("Khong co " + x + " trong day ");
		}
	}

	public static int[] input() {
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100);
			int t = rd.nextInt(100);

		}
		return arr;
	}

	public static void output(int[] a) {
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
	}
}
