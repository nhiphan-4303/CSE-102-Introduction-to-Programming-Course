
import java.util.Random;
import java.util.Scanner;

public class C8_vd1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = input();
		output(arr);

		System.out.println("\n" + "Liet ke so chan: ");
		evenEle(arr);

		System.out.println("\n" + "Liet ke so le: ");
		oddEle(arr);

		System.out.println("\n" + "Liet ke so nguyen to: ");
		listPrime(arr);
		
		System.out.println("\n" + "Liet ke so o vi tri le: ");
		listOddIndex(arr);
	}

	public static void listOddIndex(int a[]) {
		for (int i = 1; i < a.length; i += 2) {
			System.out.print(a[i] + " ");
		}
	}

	public static void listPrime(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void oddEle(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0)
				System.out.print(a[i] + " ");
		}
	}

	public static void evenEle(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.print(a[i] + " ");
		}
	}

	public static int[] input() {
		System.out.println("Nhap vao size cua mang: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		Random rd = new Random();
		for (int i = 0; i < size; i++) {
			arr[i] = rd.nextInt(50);
		}
		return arr;
	}

	public static void output(int[] a) {
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

}
