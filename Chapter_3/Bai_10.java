//Input 3 integer numbers, then check if those number can form a triangle or not. 
//If Yes, is that the isosceles triangle, right triangle, equilateral triangle or normal triangle.
import java.util.Scanner;

public class Bai_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lenght a = ");
		int a = sc.nextInt();

		System.out.print("Enter the lenght b = ");
		int b = sc.nextInt();

		System.out.print("Enter the lenght c = ");
		int c = sc.nextInt();

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