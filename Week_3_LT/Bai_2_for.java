
// in ra so le or so chan
import java.util.Scanner;

public class Bai_2_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1, count = 0; i <= n; i += 2) {
			System.out.print(i + " ");
			count++;
			if (count % 10 == 0)
				System.out.println();
		}
		sc.close();
	}

}
