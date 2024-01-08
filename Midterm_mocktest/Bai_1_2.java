import java.util.Scanner;

public class Bai_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		boolean flag = true;
		
		if (n<0) {
			flag = false;
		}
		
		while (n>1) {
			if (n%2==0) {
				flag = true;
			}
			else {
				flag = false;
				break;
			}
			n/=2;
		}
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}
