import java.util.Scanner;

public class Bai_1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// System.out.print("Nhap so mon hang: ");
		int n = sc.nextInt();

		// System.out.print("Nhap so tien Teo co: ");
		long k = sc.nextLong();

		String[] tenHang = new String[n];
		int[] giaTien = new int[n];

		for (int i = 0; i < n; i++) {
			tenHang[i] = sc.next();
			giaTien[i] = sc.nextInt();
		}

		// print(tenHang);
		// print(giaTien);

		// System.out.println();
		findItem(k, n, giaTien, tenHang);

	}

	public static void print(int[] a) {
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	public static void print(String[] b) {
		for (String s : b) {
			System.out.print(s + " ");
		}
	}

	public static void findItem(long k, int n, int[] giaTien, String[] tenHang) {
		boolean flag = true;

		for (int i = 0; i < n; i++) {
			if (giaTien[i] <= k) {
				flag = false;
				
				System.out.println(tenHang[i]+ " ");
			}
		}
		if (flag)
			System.out.println(-1);
	}
}