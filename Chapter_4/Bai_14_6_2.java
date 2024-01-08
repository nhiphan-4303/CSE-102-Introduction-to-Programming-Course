//Is N a symmetric number?

import java.util.Scanner;

public class Bai_14_6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		long n = sc.nextLong();
		long m = n;
		long res = 0;
		while (n>0) {
			long t = n%10;
			res = res*10+t;
			n/=10;
		}
		if (res==m)
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();

	}

}
