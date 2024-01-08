import java.util.Scanner;

public class Bai_1_teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		while (n % 2 == 0) {
			n /= 2;
		}
		if (n == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();

	}

}
