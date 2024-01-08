//Write a program that accepts three integer numbers from the user and prints the maximum number.

import java.util.Scanner;

public class Bai_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the integer number a: ");
		int a = sc.nextInt();
		System.out.println("Enter the integer number b: ");
		int b = sc.nextInt();
		System.out.println("Enter the integer number c: ");
		int c = sc.nextInt();

		int max = a;

		if (b > a) {
			max = b;
		}
		if (c > a) {
			max = c;
		}

		System.out.println("The maximum number is " + max);
		sc.close();

	}

}
