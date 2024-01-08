//Nhập 1 số nguyên dương n, tính tổng các số chẵn từ 1 đến n.

import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer number: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 2; i <= n; i += 2) {
			System.out.println(i + " ");
			sum += i;
		}
		System.out.println("Sum = " + sum);
		sc.close();
	}
}
