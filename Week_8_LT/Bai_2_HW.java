/* Cuối khóa học, thầy giáo có chuẩn bị 1 số món quà cho các bạn có số điểm
top 3 cao nhất khóa học. Tuy nhiên, có 1 số bạn có điểm thi bằng nhau. Hãy
tính giúp thầy xem cần chuẩn bị bao nhiêu phần quà để trao thưởng
*EX:input: số điểm N học sinh trong lớp
*N = 10
*30 36 21 32 33 36 34 33 26 30
*36 36 34 33 33 32 30 30 26 21
*output: 5*/

import java.util.Random;
import java.util.Scanner;

public class Bai_2_HW {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int[] a = input();

		output(a);
		sapXepGiam(a);
		output(a);
		System.out.println("So qua la: " + demQua(a));

	}

	public static int demQua(int[] a) {
		int i = 0;
		int count = 0;
		while (count < 3) {
			if (a[i] != a[i + 1]) {
				count++;
			}
			i++;
		}
		return i;
	}

	public static void sapXepGiam(int[] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++)
				if (a[i] < a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
	}

	public static void output(int[] a) {
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static int[] input() {
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = rd.nextInt(10);
		}
		return a;
	}

}
