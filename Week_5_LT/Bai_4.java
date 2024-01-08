
//4. viết hàm kiểm tra số nguyên tố.
import java.util.Scanner;

public class Bai_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the positive integer number: ");
		long n = sc.nextLong();

		if (isPrime(n)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

	public static boolean isPrime(long n) {
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

}
