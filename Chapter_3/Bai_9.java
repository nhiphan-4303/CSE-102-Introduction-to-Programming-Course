//Calculate the taxi payment by: 1
//1st km is 13000đ
//each following km is 12000đ
//from 30th km each km will be 11000đ
//Input the km then output the payment.

import java.util.Scanner;

public class Bai_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the kilometers: ");

		double km = sc.nextDouble();
		double price = 0;

		if (km <= 29)
			price = 13000 + 12000 * (km - 1);
		else
			price = 13000 + 12000 * 28 + 11000 * (km - 29);

		System.out.println("The payment is: " + price + " VND");
		sc.close();
	}

}
