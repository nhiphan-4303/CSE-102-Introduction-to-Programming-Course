//Calculate n!

import java.util.Scanner;

public class L3_3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		System.out.print("Gia thua cua " + n + " la: " + giaiThua(n));

	}
	public static int giaiThua(int n) {
		int giaiThua=1;
		for (int i=1; i<=n; i++) {
			giaiThua *=i;
		}
		return giaiThua;
	}


}
