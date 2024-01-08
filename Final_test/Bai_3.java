
/*Bố Tèo đưa cho Tèo 1 chữ số N (0 < N < 1018) và yêu cầu Tèo hay
thay đổi vị trí của các chữ số trong số N đó để số N đạt được giá trị lớn nhất. 
Hãy viết chương trình giúp Tèo tìm được chữ số theo yêu cầu của Bố Tèo.
- Input: 1 số nguyên N.
- Output: Giá trị của số N theo yêu cầu của đề bài.*/
import java.util.Scanner;

public class Bai_3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long n = sc.nextLong();
		if (n == 0)
			System.out.println(0);
		long[] a = input(n);
		sapXepGiam(a);
		output(a);

	}

	public static void sapXepGiam(long[] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++)
				if (a[i] < a[j]) {
					long t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
	}

	public static void output(long[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

	public static long[] input(long n) {
		int count = count(n);
		long[] a = new long[count];

		for (int i = 0; i < count; i++) {
			a[i] = n % 10;
			n /= 10;
		}
		return a;

	}

	public static int count(long n) {
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;
	}
}