//Solve the linear equation ax+b=0

import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ");
		double a = sc.nextDouble();
		System.out.println("Enter b ");
		double b = sc.nextDouble();

		if (a == 0 && b != 0)
			System.out.println("Vo nghiem");
		if (a != 0 && b == 0)
			System.out.println("x = 0");

		if (a == 0 && b == 0)
			System.out.println("Phuong trinh vo so nghiem");

		if (a != 0 && b != 0) {
			double x = (-b / a);
			System.out.println(x);
		}

		sc.close();
	}

}
