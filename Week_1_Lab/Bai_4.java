//Write a program that accepts student information and prints on the screen as the following template
import java.util.Scanner;

public class Bai_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name, student ID, major, phone number and gender: ");
		String name = sc.nextLine();
		String id = sc.nextLine();
		String major = sc.nextLine();
		String number = sc.nextLine();
		String gender = sc.nextLine();
		
		System.out.println("Full name: " + name + "\nStudent ID: " + id + "\nMajor: " + major
				+ "\nPhone Number: " + number + "\tGender: " + gender);
		sc.close();
	}

}
