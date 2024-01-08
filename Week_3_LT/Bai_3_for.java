//in ra cac uoc so cua n

import java.util.Scanner;

public class Bai_3_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n / 2; i++) // for co 1 lenh con la if nen ko can cap ngoac 
			if (n % i == 0)
				System.out.print(i + " ");

		System.out.println(n);
		sc.close();
	}

}
