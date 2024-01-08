
//Input an integer n. Output n is a square root of an integer number or not.
import java.util.Scanner;

public class Bai_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an integer number: ");
		int n = sc.nextInt();
		double sq = Math.sqrt(n);
		int temp = (int) sq;
		if (temp*temp == n) {
			System.out.println(n + " is a square root of an integer.");
		} else {
			System.out.println(n + " is not a square root of an integer.");
		}

		sc.close();
	}
}
