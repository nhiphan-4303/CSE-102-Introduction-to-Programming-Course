//Input 3 numbers a, b and c, output 3 numbers in incremental order (suppose a!b!c).

import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = sc.nextDouble();

		System.out.print("Enter b: ");
		double b = sc.nextDouble();

		System.out.print("Enter c: ");
		double c = sc.nextDouble();

		double max = a;
		if (b > max)
			max = b;

		if (c > max)
			max = c;
		System.out.println("Max = " + max);

		double min = a;
		if (b < min) 
			min = b;
		
		if (c < min) 
			min = c;
		System.out.println("Min = " + min);

		//*double mid = 0;
		//if (a < max && a > min) {
			//mid = a;
		//} else if (b < max && b > min) {
			//mid = b;
		//} else if (c < max && c > min) {
			//mid = c;
		//}
		double total = a+b+c;
		double mid = total - max - min;

		System.out.println(min + ", " + mid + ", " + max);
		sc.close();
	}

}
