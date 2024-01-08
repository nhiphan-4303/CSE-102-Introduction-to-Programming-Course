//Viết hàm đếm xem có bao nhiêu số nguyên tố trong dãy

import java.util.Random;
import java.util.Scanner;

public class Bai_4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = input();
		output(a);
		System.out.println("\n" + "Cac so chan la: ");
		listChan(a);
		System.out.println("\n" + "So so nguyen to trong day la: ");
		System.out.println(countPrime(a));

	}

	public static int countPrime(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i]))
				count++;
		}
		return count;
	}
	public static boolean isPrime(int n) {
		for (int i =2; i<Math.sqrt(n); i++) {
			if (n %i==0) {
				return false;
			}
		}
		return true;
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
