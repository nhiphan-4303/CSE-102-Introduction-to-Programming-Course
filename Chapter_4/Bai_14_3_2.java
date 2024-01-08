/*Input a positive integer N:
- The odd digits is more than even digit or vice versa*/

import java.util.Scanner;

public class Bai_14_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long count = 0;

		while (n > 0) {
			long i = n % 10;
			if (i % 2 == 0) {
				count++;
			} else {
				count--;
			}
			n = n / 10;
		}
		if (count > 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		sc.close();

	}

}
