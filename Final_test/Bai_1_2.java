/*Question 1 (30 points): Trong một cửa hàng đồ lưu niệm có N (0 < N <105) 
 * món quà, có tên lần lượt là A1, A2, …, AN , 
 * và có giá tiền lần lượt là V1, V2, …, VN (0 ≤ Vi ≤ 109). 
 * Tèo có K (0 ≤ K ≤ 109) đồng trong túi. 
 * Hãy viết chương trình giúp Tèo liệt kê tên các món hàng có trong 
 * cửa hàng mà Tèo có thể mua được.
 * - Input:
 * + Dòng đầu tiên là 2 số nguyên N và K.
 * + N dòng tiếp theo, mỗi dòng gồm có Tên món hàng và giá tiền 
 * của món hàng đó cách nhau bởi khoảng trắng.
 * - Output: Tên các món hàng mà Tèo mua được. 
 * Nếu không tìm được món hàng nào thì xuất ra -1.*/

import java.util.Scanner;

public class Bai_1_2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();// mon qua
		int k = sc.nextInt();// so tien

		String[] tenHang = new String[n];
		int[] giaTien = new int[n];
		for (int i = 0; i < n; i++) {
			tenHang[i] = sc.next();
			giaTien[i] = sc.nextInt();
		}

		output(k, giaTien, tenHang);

	}

	public static void output(int k, int[] giaTien, String[] tenHang) {
		boolean flag = true;
		for (int i = 0; i < giaTien.length; i++) {
			if (giaTien[i] <= k) {
				flag = false;
				System.out.println(tenHang[i] + " ");
			}
		}
		if (flag)
			System.out.println(-1);
	}

}
