//Nhap ten say hello + name

import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = sc.nextLine();

		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		sayHello(name, age);//truyen bien phai dung thu tu
		sc.close();

	}

	public static void sayHello(String s, int year_olds) {
		System.out.println("Hello " + s + ", " + year_olds + " year olds.");

	}

}
