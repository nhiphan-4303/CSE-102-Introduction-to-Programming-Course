

import java.util.Random;
import java.util.Scanner;


public class Bai_8 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int[] n = input();
		output(n);
		maxNegative(n);
		minPositive(n);
	}

	public static void maxNegative(int[] n) {
		int max = Integer.MIN_VALUE;
		for (int e : n)
			if (e < 0 && e > max)
				max = e;
		if (max == Integer.MIN_VALUE)
			System.out.println("Day khong co so am");
		else {
			System.out.println(max);
		}
		
	}
	public static void minPositive(int[] n) {
		int min=Integer.MAX_VALUE;
		for (int e:n)
			if(e>0 && e<min)
				min=e;
		if (min == Integer.MAX_VALUE)
			System.out.println("Day khong co so duong");
		else {
			System.out.println(min);
		}
	}

	public static int[] input() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(200);
			int t = rd.nextInt(200);
			t=t-100;
			arr[i]=t;
		}
		return arr;
	}

	public static void output(int[] n) {
		for (int i : n)
			System.out.print(i + " ");
		System.out.println();
	}
}
