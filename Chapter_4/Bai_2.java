/*Write a program to input a positive integer
n. Check if n is a perfect square number?
(This is a number that when taken root of 2
has an integer result)*/

import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number: ");
		int n = sc.nextInt();
		double sqrt = (double) Math.sqrt(n);
		if ((sqrt * sqrt) - n == 0)
			System.out.println(n + " is a perfect square number");
		else
			System.out.println(n + " is not a perfect square number");
		sc.close();
	}
}
