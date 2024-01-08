
//Nhập n, in ra n số nguyên tố đầu tiên.
import java.util.Scanner;

public class Bai_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the positive integer number: ");

		long n = sc.nextLong();
		nFirstPrime(n);

		sc.close();

	}

	public static void nFirstPrime(long n) {
		long count = 0;
		int i = 2;

		while (count < n) {
			if (isPrime(i)) {
				System.out.println(i + " ");
				count++;
			}
			i++;
		}
	}

	public static boolean isPrime(long n) {
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
