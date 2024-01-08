//Nhap 1 so nguyen duong n, in ra cac so tu 1 den n, du 10 so thi xuong dong
//idea:
//bat dau tu i=1
//kiem tra trong khi i con nho hon n thi:
//in gia tri hien tai ra mann hinh
//cap nhat lai gia tri i

import java.util.Scanner;

public class Bai_1_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*int i = 1;
		while (i <= n) {
			System.out.printf("%3d", i);

			if (i % 10 == 0)
				System.out.println();
			i++;
			sc.close();*/
		for (int i = 1; i <= n; i++)
			System.out.println(i + " ");
		sc.close();

	}

}
