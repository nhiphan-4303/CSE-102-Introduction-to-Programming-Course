/*Question 2 (30 points): Tèo muốn mua 1 món quà cho bạn gái nhân dịp sinh nhật
, Tèo có K (0 ≤ K ≤ 109) đồng trong túi. 
Trong cửa hàng đồ lưu niệm có N (0 ≤ N ≤ 105) món hàng có 
giá trị tương ứng là V0, V1, ..., Vn-1, (0 < Vi ≤ 109). 
Hãy viết chương trình giúp Tèo chọn 1 món quà có giá trị cao nhất 
có thể với số tiền mà Tèo có.
- Input:
+ Dòng đầu tiên là 2 số nguyên N và K.
+ Dòng thứ 2 là N số nguyên tương ứng N giá trị của món hàng.
- Output: Giá trị món quà cao nhất mà Tèo mua được. Nếu không có món quà nào được
chọn thì xuất ra -1.*/

import java.util.Scanner;

public class Bai_2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		long k = sc.nextLong();

		int[] a = input(n);

		max(a, k);

	}

	public static void max(int[] a, long k) {
		int max = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < k && a[i] > max) {
				max = a[i];
			}
		}
		if (max == -1) {
			System.out.println(-1);
		} else
			System.out.println(max);

	}

	public static int[] input(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

}
