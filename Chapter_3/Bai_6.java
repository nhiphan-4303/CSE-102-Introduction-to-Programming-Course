//Check the validation of input date, month, year. Output valid or invalid
import java.util.Scanner;

public class Bai_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date, month and year: ");

		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();

		if (year < 0 || year > 2023) {
			System.out.println("Invalid");
		} else {
			if (month < 0 || month > 12) {
				System.out.println("Invalid");
			} else {
				if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
					if (day < 0 || day > 31) {
						System.out.println("Invalid");
					} else {
						System.out.println("valid");
					}
				}
				if (month == 2) {
					if (day < 0 || day > 28) {
						System.out.println("Invalid");
					} else {
						System.out.println("valid");
					}
				} else {
					if (day < 0 || day > 30) {
						System.out.println("Invalid");
					} else {
						System.out.println("valid");
					}
				}
			}
		}
		sc.close();
	}
}
