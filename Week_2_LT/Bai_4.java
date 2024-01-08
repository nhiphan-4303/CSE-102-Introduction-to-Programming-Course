
// Nhap vao mot so nguyen duong n, kiem tra xem n co phai la so chinh phuong hay ko?
//So chinh phuong la so co can bac 2 la 1 so nguyen
import java.util.Scanner;

public class Bai_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao mot so nguyen duong: ");
		int n = sc.nextInt();

		double temp = Math.sqrt(n);

		if (temp * temp == n) {
			System.out.println(n + " la so chinh phuong");
		} else {
			System.out.println(n + " khong phai la so chinh phuong");
		}
		sc.close();

	}

}
