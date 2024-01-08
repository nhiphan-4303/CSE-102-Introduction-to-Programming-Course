//Giving an integer n, find the absolute value of n. Note: do not use the Math.abs() method.

import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: ");

		int n = sc.nextInt();

		if (n < 0) {
			System.out.print("The absolute value of n is: " + -n);
		} else {
			System.out.print("The absolute value of n is: " + n);
		}
		sc.close();

	}

}
