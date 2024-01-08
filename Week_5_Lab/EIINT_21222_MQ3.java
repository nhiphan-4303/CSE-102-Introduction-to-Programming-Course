/*A special number is a natural number with at least 3 digits that is divisible by the number formed by its first and last digits. 
Given an integer N (0 ≤ N≤10^18), check if N is a special number or not?*/

import java.util.Scanner;

public class EIINT_21222_MQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		long n = sc.nextLong();
		long last = n % 10;
		long first = 1;
		long m = n;

		if (n >= 100) {

			while (n > 0) {
				first = n % 10;
				n /= 10;
			}
			long form = first * 10 + last;
			if (m % form == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		} else {
			System.out.println("NO");
		}
		sc.close();

	}
}
