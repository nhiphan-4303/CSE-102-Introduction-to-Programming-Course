//Đếm xem trong dãy có bao nhiêu phần tử lớn hơn phần tử trung binh của dãy

import java.util.Random;
import java.util.Scanner;

public class Bai_2 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int[] a = input();
		output(a);
		float n = 0;
		System.out.println("Phan tu trung binh la: " + everageEle(a));
		System.out.println("So phan tu lon hon phan tu trung binh la " + countEle(n, a));

	}

	public static int countEle(float n, int[] a) {
		n = everageEle(a);
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > n) {
				count++;
			}
		}
		return count;
	}

	public static float everageEle(int[] a) {
		float sum = 0;
		float avg = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		avg = sum / a.length;
		return avg;
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
