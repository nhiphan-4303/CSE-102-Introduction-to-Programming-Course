//Is N a symmetric number?

import java.util.Scanner;

public class Bai_14_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		long n = sc.nextLong();
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		if (s.compareTo(sb.toString()) == 0)
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();

	}

}
