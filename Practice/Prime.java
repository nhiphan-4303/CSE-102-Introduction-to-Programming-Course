//print prime from 2 to n 

import java.util.Scanner;

public class Prime {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		listPrime(n);

	}

	public static boolean Prime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void listPrime(int n) {
		for (int i = 2; i <= n; i++) {
			if (Prime(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
