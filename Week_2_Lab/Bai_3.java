//Solve the linear equation: ax + b = 0.


import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number a: ");
		double a = sc.nextDouble();

		System.out.println("Enter the number b: ");
		double b = sc.nextDouble();

		double x;

		if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem.");
		}

		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh vo so nghiem.");
		}

		if (a != 0 && b == 0) {
			System.out.println("Phuong trinh co nghiem x = 0.");
		}

		if (a != 0 && b != 0) {
			x = -b / a;
			System.out.println("Phuong trinh co nghiem x = " + x);
		}
		sc.close();

	}
}
