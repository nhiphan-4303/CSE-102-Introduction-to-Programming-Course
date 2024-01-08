//hàm tình chu vi hcn, hàm này nhận đầu vào là 2 canh of hcn, trả về chu vi hcn đó.

import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap cd: ");
		int cd = sc.nextInt();

		System.out.print("Nhap cr: ");
		int cr = sc.nextInt();

		System.out.println(tinhChuVi(cd, cr));
		sc.close();

	}

	public static int tinhChuVi(int cd, int cr) {
		return (cd + cr) * 2;
	}

}
