//Write a program that accepts a two-digit integer number (N) from user and prints the sum of figures in N

import java.util.Scanner;

public class Bai_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two-digit integer number: ");
		int a = sc.nextInt();
		int b = a / 10;
		int c = a % 10;

		System.out.println(b + " + " + c + " = " + (b + c));
		
		sc.close();
	}

}
