//Write a program that accepts hours, minutes, and seconds from the user, 
//converts them into a number of seconds, and prints it on the screen.
import java.util.Scanner;

public class Bai_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter hours, minutes and seconds: ");
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int convert = h*3600 + m*60 + s;
		
		System.out.println("Total of seconds: " + convert);
		
		sc.close();
	}

}

