import java.util.Random;
import java.util.Scanner;

public class Bai_11 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = input();
		output(a);
		System.out.println();
		int res = findMaxPrime(a);
		if (res==-1)
			System.out.println("Khong co SNT trong day");
		else
			System.out.println(res);
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
	public static int findMaxPrime(int[]a) {
		int max_prime=-1;
		for (int e:a) {
			if (isPrime(e) && e>max_prime) {
				max_prime = e;
			}
		}
		return max_prime;
	}
}