//Write a program that accepts two integer numbers (a and b), and prints the sum, difference, 
//product, quotient,remainder, and average of the numbers.
import java.util.Scanner;

public class Bai_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two integer numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		int dif = a - b;
		int pro = a * b;
		float quo = ((float)a / b);
		int rem = a % b;
		float avr = (float)(a+b)/2;
		
		System.out.println("Sum = " + sum + "\nDifference = " + dif + "\nProduct = " 
		+ pro + "\nQuotient = " + quo + "\nRemainder = " + rem + "\nAverage = " + avr);
		
		sc.close();
	}

}
