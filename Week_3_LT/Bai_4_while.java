//Dem xem N co bao nhieu uoc so

import java.util.Scanner;

public class Bai_4_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number: ");
		int n = sc.nextInt();
		int count = 1;
		for (int i = 1; i <= n / 2; i++)
			if (n % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		System.out.println(n);
		System.out.println(count);
		sc.close();
	}

}
