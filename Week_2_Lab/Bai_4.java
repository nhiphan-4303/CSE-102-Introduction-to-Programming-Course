//Solve a polynomial equation: ax2 + bx + c = 0 (a != 0).

import java.util.Scanner;

public class Bai_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number a: ");
		double a = sc.nextDouble();

		System.out.println("Enter the number b: ");
		double b = sc.nextDouble();

		System.out.println("Enter the number c: ");
		double c = sc.nextDouble();

		double x1;
		double x2;
		double x;
		double delta = (b * b) - (4 * a * c);

		if (delta > 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Phuong trinh co nghiem x1 = " + x1 + "; x2 = " + x2);
		}
		if (delta == 0) {
			x = -b / (2 * a);
			System.out.println("Phuong trinh co nghiem x1 = x2 = x =  " + x);
		}
		if (delta < 0) {
			System.out.println("Phuong trinh vo nghiem");
		}
		sc.close();

	}

}
