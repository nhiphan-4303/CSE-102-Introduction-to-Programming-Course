
/*Given an array arr of n integers and an integer k. 
 * Write a program that accepts these variables 
 * from the user and prints the number of elements in arr, 
 * which are equal to k.*/
import java.util.Scanner;

public class codeLearn_63 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = input();
		int k = sc.nextInt();

		System.out.println(eleEqualK(arr, k));

	}

	public static int eleEqualK(int[] a, int k) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == k) {
				count++;
			}
		}
		return count;

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
