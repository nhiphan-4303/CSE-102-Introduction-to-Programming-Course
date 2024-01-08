//Tinh chu vi va dien tich tam giac

import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap do dai 3 canh cua tam giac: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double cv_tg = a + b + c;
		System.out.println("Chu vi tam giac la: " + cv_tg);

		double p = (a + b + c) / 2;
		double dt_tg = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("Dien tich tam giac la: " + dt_tg);

//Tinh chu vi va dien tich hinh tron
		System.out.println("Nhap ban kinh hinh tron: ");
		double r = sc.nextDouble();
		double cv_ht = Math.PI * 2 * r;
		System.out.println("Chu vi hinh tron la: " + cv_ht);

		double dt_ht = Math.PI * r * r;
		System.out.println("Dien tich hinh tron la: " + dt_ht);

//Tinh chu vi va dien tich hinh chu nhat
		System.out.println("Nhap do dai 2 canh cua hinh chu nhat: ");
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double cv_hcn = (d + e) * 2;
		System.out.println("Chu vi hinh chu nhat la: " + cv_hcn);

		double dt_hcn = d * e;
		System.out.println("Dien tich hinh chu nhat la: " + dt_hcn);
		
		sc.close();
	}

}
