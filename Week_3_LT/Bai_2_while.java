
// in ra so le or so chan
import java.util.Scanner;

public class Bai_2_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int count = 0;
		while (i <= n) {
			System.out.printf("%3d", i);
			count++;
			if (count % 10 == 0)
				System.out.println();
			i += 2;
			sc.close();
		}
	}

}
