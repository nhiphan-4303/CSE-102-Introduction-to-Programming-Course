//3. Xóa phần tử xuất hiện nhiều lần nhất trên dãy
import java.util.Random;
import java.util.Scanner;

public class Bai_3_HW {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int[] n = input();
		output(n);
		System.out.println("Phan tu xuat hiẹn nhieu lan nhat trong day là: " 
		+ findMaxOccur(n));
		
		n=delete(n);
		output(n);
		
	}
	public static int[] delete(int[] a) {
		int[] b = new int[a.length - 1];
		int i;
		for (i = 0; i < index(a); i++) {
			b[i] = a[i];
		}
		for (i = index(a); i < b.length; i++) {
			b[i] = a[i + 1];
		}
		return b;

	}

	public static int index(int[] a) {
		int x = findMaxOccur(a);
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x)
				index = i;
		}
		return index;
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
	public static int findMaxOccur(int[] n) {
		int value = n[0];
		int max_count = countX(n, n[0]);
		for (int i = 1; i < n.length; i++) {
			int count = countX(n, n[i]);
			if (count > max_count) {
				max_count = count;
				value = n[i];
			}
		}
		return value;
	}
	public static int[] input() {
		Random rd = new Random();
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(10);

		}
		return arr;
	}

	public static void output(int[] n) {
		for (int i : n)
			System.out.print(i + " ");
		System.out.println();
	}

}
