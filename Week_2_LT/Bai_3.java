
//Nhap vao 4 so nguyen duong a,b,c,d in so lon nhat ra man hinh 
import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao so nguyen duong a: ");
		int a = sc.nextInt();

		System.out.println("Nhap vao so nguyen duong b: ");
		int b = sc.nextInt();

		System.out.println("Nhap vao so nguyen duong c: ");
		int c = sc.nextInt();

		System.out.println("Nhap vao so nguyen duong d: ");
		int d = sc.nextInt();

		int max = a;

		if (b > max) {
			max = b;
		}
		if (c > max)
			;
		{
			max = c;
		}
		if (d > max)
			;
		{
			max = d;
		}
		System.out.println("So lon nhat la: " + max);
		sc.close();

	}

}
