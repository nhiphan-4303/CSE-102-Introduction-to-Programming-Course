import java.util.Scanner;

public class Q2_22_23_Bai_3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();

		double[] a = input(n);
		System.out.println(count(a));

	}

	public static int count(double[] a) {
		double avr = avr(a);
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > avr) {
				count++;
			}
		}
		return count;
	}

	public static double avr(double[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avr = sum / a.length;
		return avr;
	}

	public static double[] input(int n) {
		double[] a = new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextDouble();
		}
		return a;
	}

}
