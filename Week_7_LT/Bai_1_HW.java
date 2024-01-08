//kiem tra day doi xung
import java.util.Scanner;

public class Bai_1_HW {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = input();
		System.out.println("Nhap phan tu cua mang: ");
		output(arr);
		System.out.println();
		if (isPalindrome(arr))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	public static boolean isPalindrome(int[] a) {
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			if (a[i] != a[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void output(int a[]) {
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	public static int[] input() {
		System.out.print("Nhap size cua mang: " + " ");
		int size = sc.nextInt();

		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

}
