//Solve S=1+2+3+4+...+n

import java.util.Scanner;

public class Bai_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int S = 0;
		for (int i = 1; i <= n; i++)
			S += i;
		System.out.println(S);
		sc.close();
	}

}
