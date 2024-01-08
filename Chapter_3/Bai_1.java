//Input 2 numbers a and b, output the larger number(suppose a!b)

import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 different numbers: ");

		double a = sc.nextDouble();
		double b = sc.nextDouble();

		if (a > b)
			System.out.println("Max is " + a);
		else
			System.out.println("Max is " + b);
		
		sc.close();
	}

}
