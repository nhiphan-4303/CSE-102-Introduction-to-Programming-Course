//Viết hàm đếm xem có bao nhiêu số chẵn trong dãy.

import java.util.Random;
import java.util.Scanner;

public class Bai_3_nhi {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = input();
		output(a);
		System.out.println("\n" + "Cac so chan la: ");
		listChan(a);
		System.out.println("\n" + "So so chan trong day la: ");
		System.out.println(countChan(a));

	}

	public static int countChan(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				count++;
		}
		return count;
	}

	public static void listChan(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.print(a[i] + " ");
		}
	}

	public static void output(int a[]) {
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	public static int[] input() {

		System.out.println("Nhap vao size cua mang: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		Random rd = new Random();
		for (int i = 0; i < size; i++) {
			arr[i] = rd.nextInt(100);
		}
		return arr;
	}

}
