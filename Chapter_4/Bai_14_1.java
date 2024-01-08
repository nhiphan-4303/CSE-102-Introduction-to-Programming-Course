
/*Input a positive integer N:
- How many digits of N?*/
import java.util.Scanner;

public class Bai_14_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long count = 0;

		while (n > 0) {
			n /= 10;
			count++;
		}
		System.out.println(count);

		/*
		 * String s = String.valueOf(n); System.out.println(s.length());
		 */
		sc.close();
	}
}
