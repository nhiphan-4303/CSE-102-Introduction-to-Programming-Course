
// in ra hinh rong
import java.util.Scanner;

public class Bai_12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width: ");
		long w = sc.nextLong();
		System.out.println("Enter the height: ");
		long h = sc.nextLong();

		for (long i = 0; i < w; i++) {
			// System.out.print("*" + " ");
			for (long j = 0; j < h; j++) {
				if (i == 0 || i == w - 1 || j == 0 || j == h - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
