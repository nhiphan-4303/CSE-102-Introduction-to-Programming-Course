
/*Write a program that accepts an array arr 
 * of n integers from the user and prints 
 * all even numbers in arr.*/
import java.util.Scanner;

public class codeLearn_62 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = input();
		evenEle(arr);

	}

	public static void evenEle(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}

	}

	public static int[] input() {
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

}
