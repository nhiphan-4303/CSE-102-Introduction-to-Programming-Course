/*Write a program that accepts an array arr of n integers from 
 * the user and prints the sum of the first element 
 * and the last element in arr on the screen.*/
import java.util.Scanner;

public class codeLearn_61 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr [] = input();
		
		System.out.println(sum(arr));
		

	}
	public static int sum (int[]a) {
		for (int i = 0; i < a.length; i++) {
		}
		int sum = a[0] + a[a.length - 1];
		return sum;
	}
	public static int[]input(){
		int n = sc.nextInt();
		int [] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a [i] = sc.nextInt();
		}
		return a;
	}
	

}
