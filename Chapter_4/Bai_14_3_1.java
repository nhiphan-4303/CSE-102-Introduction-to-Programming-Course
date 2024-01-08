
/*Input a positive integer N:
- The odd digits is more than even digit or vice versa*/
import java.util.Scanner;

public class Bai_14_3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		long count_1=0;
		long count_2=0;
		long m=n;

		while (n > 0) {
			long a = n % 10;
			if (a % 2 == 0) {
				count_1++;

			}
			n = n / 10;

		}
		while (n > 0) {
			long a = n % 10;
			if (a % 2 == 0) {
				count_1++;

			}
			n = n / 10;

		}
		while (m > 0) {
			long a = m % 10;
			if (a % 2 != 0) {
				count_2++;

			}
			m = m / 10;

		}
		System.out.println(count_1);
		System.out.println(count_2);
		
		if (count_1>count_2)
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();

	}
}
