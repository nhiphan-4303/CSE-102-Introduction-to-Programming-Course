import java.util.Scanner;

public class Q2_22_23_Bai_1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();

		String[] id = new String[n];
		int[] score = new int[n];
		for (int i = 0; i < n; i++) {
			id[i] = sc.next();
			score[i] = sc.nextInt();
		}
		System.out.println(output(id, score));

	}

	public static String output(String[] a, int[] s) {
		int max = 0;
		String maxS = null;
		for (int i = 0; i < s.length; i++) {
			if (s[i] > max) {
				max = s[i];
				maxS = a[i];
			}
		}
		return maxS;
	}

}
