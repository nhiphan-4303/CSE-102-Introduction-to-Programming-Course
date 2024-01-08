import java.util.Random;
import java.util.Scanner;

public class Bai_4_main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = input();
		output(a);
		for (int i = 0; i < a.length; i++)
			if (a[i]%2==0)
				System.out.print(a[i] + " ");
		System.out.println();
		
		for (int val:a)//Cách 2
			if (val%2==0)
				System.out.print(val + " ");
	}

	public static int[] input() {
		Random rd = new Random();
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100);
	
		}
		return arr;
	}

	public static void output(int[] e) {
		for (int i = 0; i < e.length; i++)
			System.out.print(e[i] + " ");
		System.out.println();
	}

}

