//Dem xem N co bao nhieu uoc so

import java.util.Scanner;

public class Bai_4_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number: ");

		int n = sc.nextInt();
		int i = 1;
		int count = 1;
		while (i <= n / 2) {
			if (n % i == 0) {
				System.out.printf(i + " ");
				count++;
			}
			i++;
		}
		System.out.println(n);
		System.out.print(count);
		sc.close();
	}

}
