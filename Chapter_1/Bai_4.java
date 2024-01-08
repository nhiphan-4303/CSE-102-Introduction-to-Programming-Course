//Enter a integer k (k>0), output k times "Hello"

import java.util.Scanner;

public class Bai_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		
		if (k > 0) {
			for (int i = 1; i <= k; i++)
				System.out.println((i) + "." + " Hello ");
		} else {
			System.out.println("Enter the number k>0: ");
		}
		
		sc.close();

	}
}
