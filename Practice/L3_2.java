
/*2. Write a program that accepts a positive integer number from the user, and
check whether it is a prime number.*//*in ra n so nguyen to dau tien*/
import java.util.Scanner;

public class L3_2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		if (isPrime(n)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		System.out.println();
		nFirstPrime(n);

	}

	public static void nFirstPrime(int n) {
		int count = 0;
		int i = 2;
		while (count <n) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count ++;
			}
			i++;
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

}
