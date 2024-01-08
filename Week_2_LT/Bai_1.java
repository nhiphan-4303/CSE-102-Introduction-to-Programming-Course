//Viet chuong trinh nhap vao mot so nguyen n, kiem tra xem n co phai la so chan khong
import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an interger number: ");
		int n = sc.nextInt();
		if (n%2==0)
			System.out.println(n + " is an interger number.");
		else
			System.out.println(n + " is not an interger number.");
		sc.close();
	}
}
