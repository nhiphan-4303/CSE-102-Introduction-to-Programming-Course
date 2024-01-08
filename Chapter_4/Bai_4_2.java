//Tim tat ca cac so hoan hao tu 0 den 1000.

public class Bai_4_2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int n = 1; n <= 1000; n++) {
			sum = 0;
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0) {
					sum += i;
				}
			}
			if (sum == n)
				System.out.println(n);

		}

	}
}