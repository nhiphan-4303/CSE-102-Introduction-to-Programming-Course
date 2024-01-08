/*Given a positive integer N (0 ≤ N ≤ 1016). 
Write a program to check if all digits in N are in descending order?*/

import java.util.Scanner;

public class EI_2021_Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer number: ");
		long n = sc.nextLong();
		boolean flag = true;
		long t;
		long previous = 0;
		while (n > 0) {
			t = n % 10;
			if (t < previous) {
				flag = false;
				break;
			}
			n /= 10;
			previous= t;

		}
		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();

	}

}
