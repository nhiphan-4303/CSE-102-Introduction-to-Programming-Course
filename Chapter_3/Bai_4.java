//Input a 3 digits integer n. Output the largest digits and it’s position. (suppose 3 digits are different)

import java.util.Scanner;

public class Bai_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3 difits integer number: ");
		int n = sc.nextInt();

		int c = n % 10;
		int b = (n / 10) % 10;
		int a = n / 100;

		int maxDigit = 0;
		String position = "";
		if (a > b && a > c) {
			maxDigit = a;
			position = "hundred";
		}

		if (b > a && b > c) {
			maxDigit = b;
			position = "ten";
		}

		if (c > a && c > b) {
			maxDigit = c;
			position = "unit";
		}

		System.out.println("The largest is " + maxDigit + " at " + position);

		sc.close();
	}

}
