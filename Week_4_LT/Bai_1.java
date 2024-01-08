//Lap bang cuu chuong 5

import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j<=10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println("/////////////////");
			

		}
		sc.close();

	}

}
