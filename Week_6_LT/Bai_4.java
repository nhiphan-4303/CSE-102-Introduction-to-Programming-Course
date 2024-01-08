import java.util.Random;
import java.util.Scanner;

public class Bai_4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] a = input();
		output(a);
		System.out.println();
		
		Chan(a);
		System.out.println();
		
		LeDigit(a);
		System.out.println();

		listPrimeEle(a);
	}

	public static int[] input() {
		Random rd = new Random();
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100);

		}
		return arr;
	}

	public static void output(int[] e) {
		for (int i = 0; i < e.length; i++)
			System.out.print(e[i] + " ");
	}

	public static void Chan(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static void LeDigit(int[] a) {
		for (int i = 1; i < a.length; i += 2) {
			System.out.print(a[i] + " ");
		}
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void listPrimeEle(int[] a) {
		for (int val : a)
			if (isPrime(val))
				System.out.print(val + " ");
	}

}