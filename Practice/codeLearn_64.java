
/*Write a program that accepts an array 
arr of n integers from the user and prints the sum 
of all odd numbers which are greater than 0 in the array.*/
import java.util.Scanner;

public class codeLearn_64 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = input();
		

		System.out.println(sum(arr));

	}

	public static int sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0 && a[i] % 2 != 0) {
				sum+=a[i];
			}
		}
		return sum;

	}

	public static int[] input() {
		System.out.print("Nhap size cua mang: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("Nhap mang: ");

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

}
