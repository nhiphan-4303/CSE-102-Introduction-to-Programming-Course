//Write a program accepts a year then outputs the corresponded lunar year.

import java.util.Scanner;

public class Bai_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");

		int n = sc.nextInt();
		String can = "";
		String chi = "";
		switch (n % 10) {
		case 0:
			can = "Canh";
			break;
		case 1:
			can = "Tan";
			break;
		case 2:
			can = "Nham";
			break;
		case 3:
			can = "Quy";
			break;
		case 4:
			can = "Giap";
			break;
		case 5:
			can = "At";
			break;
		case 6:
			can = "Binh";
			break;
		case 7:
			can = "Dinh";
			break;
		case 8:
			can = "Mau";
			break;
		case 9:
			can = "Ky";
			break;
		}
		switch (n % 12) {
		case 0:
			chi = "Than";
			break;
		case 1:
			chi = "Dau";
			break;
		case 2:
			chi = "Tuat";
			break;
		case 3:
			chi = "Hoi";
			break;
		case 4:
			chi = "Ty";
			break;
		case 5:
			chi = "Suu";
			break;
		case 6:
			chi = "Dan";
			break;
		case 7:
			chi = "Meo";
			break;
		case 8:
			chi = "Thin";
			break;
		case 9:
			chi = "Ty";
			break;
		case 10:
			chi = "Ngo";
			break;
		case 11:
			chi = "Mui";
			break;
		}
		System.out.println("The current year is: " + can + " " + chi);
		sc.close();
	}

}
