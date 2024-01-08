//Input 3 numbers a, b and c, output the largest number(suppose a!b!c).

import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double max = a;

		if (b > max)
			max = b;

		if (c > max)
			max = c;

		System.out.println("The largest number is: " + max);
		
		sc.close();
	}

}
