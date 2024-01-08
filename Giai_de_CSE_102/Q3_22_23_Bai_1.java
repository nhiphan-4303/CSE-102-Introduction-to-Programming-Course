import java.util.Scanner;

public class Q3_22_23_Bai_1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int salary = 1;
		int sum = 1;

		for (int i = 1; i < n; i++) {
			salary *= 2;
			sum+=salary;
		}
		System.out.println(sum);
	}

}
