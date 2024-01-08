import java.util.Scanner;

public class Q1_22_23_Bai_2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();

		long[] id = new long[n];
		int[] g = new int[n];
		for (int i = 0; i < n; i++) {
			id[i] = sc.nextLong();
			g[i] = sc.nextInt();
		}
		System.out.println(output(id, g));

	}

	public static long output(long[] id, int[] g) {
		int max = 0;
		long maxId = 0;
		for (int i = 0; i < g.length; i++) {
			if (g[i] > max) {
				max = g[i];
				maxId = id[i];
			} else if (g[i] == max && id[i] > maxId) {
				maxId = id[i];

			}
		}
		return maxId;
	}

}
