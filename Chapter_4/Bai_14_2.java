/**Input a positive integer N:
- What is the greatest digit?*/
import java.util.Scanner;

public class Bai_14_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		int max = -1;
		while (n > 0) {
			int a = (int) (n % 10);
			if (a > max)
				max = a;
			n = n / 10;
		}
		System.out.println(max);
		sc.close();

	}

}
