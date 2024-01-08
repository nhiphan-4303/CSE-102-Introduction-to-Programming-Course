//Enter the lengths of a triangle a, b and c. Check whether a, b, c
//form a triangle or not. If It is a triangle, print the it’s type (rightangled, isosceles, equilateral, obtuse, scalene triangle)

import java.util.Scanner;

public class Bai_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lenght a = ");
		double a = sc.nextDouble();

		System.out.print("Enter the lenght b = ");
		double b = sc.nextDouble();

		System.out.print("Enter the lenght c = ");
		double c = sc.nextDouble();

		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("This is the triangle.");
			if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
				System.out.println("This is the rightangled.");
			}

			else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
				System.out.println("This is the isosceles.");
			}

			else if (a == b && b == c) {
				System.out.println("This is the equilateral.");
			}

			else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b) {
				System.out.println("This is the obtuse.");
			} else {
				System.out.println("This is the scalene triangle.");
			}
		} else {
			System.out.println("This is not the triangle.");

			sc.close();
		}
	}
}