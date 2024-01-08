import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long p = 1;
		boolean flag = true;
		
		if (n<0) {
			flag=false;
		}

		while (n > 0) {
			flag = true;
			p *= 2;
			if (p == n) {
				break;
			} else if (p > n) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();

	}

}
