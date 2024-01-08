//in ra cac uoc so cua n

import java.util.Scanner;

public class Bai_3_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number: ");

		int n = sc.nextInt();
		int i = 1;

		while (i <= n / 2) {
			if (n % i == 0)
				System.out.printf(i + " ");
			i++;
		}
		System.out.println(n);
		sc.close();

	}

}
