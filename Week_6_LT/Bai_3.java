import java.util.Random;
import java.util.Scanner;

public class Bai_3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = input();
		for (int i : a)
			System.out.print(i + " ");
		// output(a);
	}

	public static int[] input() {
		Random rd = new Random();
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			// arr[i] = rd.nextInt(100);
			arr[i] = sc.nextInt();// cho người dùng tự nhập dữ liệu
		}
		return arr;
	}

	public static void output(int[] e) {
		for (int i = 0; i < e.length; i++)
			System.out.print(e[i] + " ");
	}

}
