//Nhap 1 so nguyen duong n, tinh tong cac so tu 1 den n

import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap 1 so nguyen duong n: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("Sum = " + sum);
		sc.close();

	}

}
