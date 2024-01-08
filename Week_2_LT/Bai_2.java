//Nhap vao 1,b.In ra so lon hon.

import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = a;
		if(b>a)
			max = b;
		System.out.println(max);
		sc.close();

	}

}
