//Check the input year, output that is the LEAP year or not.

import java.util.Scanner;

public class Bai_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");

		int year = sc.nextInt();

		if (year % 4 == 0)
		System.out.println(year + " is the leap year.");
		
		else
		System.out.println(year + " is not the leap year.");

		sc.close();
	}

}

