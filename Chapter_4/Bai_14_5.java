//Is there any odd digit?

import java.util.Scanner;

public class Bai_14_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		long n = sc.nextLong();
		
		boolean flag = false;
		long i = 1;

		while (n > 0) {
			i = n % 10;
			if (i%2 != 0) {
				flag = true;
				break;
			}
			n /= 10;
		}
		if (flag)
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();

	}

}
