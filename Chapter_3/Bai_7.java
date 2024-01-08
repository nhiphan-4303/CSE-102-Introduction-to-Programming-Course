//Check the validation of input hour, minute, second. Output valid or invalid
import java.util.Scanner;

public class Bai_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter hours: ");
		int hours = sc.nextInt();

		System.out.print("Enter minutes: ");
		int minutes = sc.nextInt();

		System.out.print("Enter seconds: ");
		int seconds = sc.nextInt();

		if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59 && seconds >= 0 && seconds <= 59) {
			System.out.println("Valid time.");
		} else {
			System.out.println("Invalid time.");
		}
		sc.close();
	}
}