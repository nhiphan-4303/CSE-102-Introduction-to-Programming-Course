//Calculate 𝑆 𝑛 = 1 + 1/1+2 + 1/1+2+3 + ⋯ + 1/1+2+3+⋯+𝑛 (n > 0).

import java.util.Scanner;

public class Bai_2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = sc.nextInt();
		System.out.println(Sn(n));
	}

	public static double Sn(double n) {
		double sum = 0;
		double Sn = 0;
		for (int j = 1; j <= n; j++) {
			sum=0;
			for (int i = 1; i <=j; i++) {
				sum += i;
			}
			Sn += 1 / sum;
		}
		return Sn;
	}

}
