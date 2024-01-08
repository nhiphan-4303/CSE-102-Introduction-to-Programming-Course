import java.rmi.server.RMIFailureHandler;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Bai_6 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int[] n = input();
		output(n);
		maxEvenEle(n);
	}

	public static void maxEvenEle(int[] n) {
		int count=0;
		int max = -1;
		for (int i = 0; i < n.length; i++)
			if (n[i] % 2 == 0 && n[i] > max)
				max = n[i];
		for(int i=0;i<n.length;i++)
			if(n[i]==max)
				count++;
		System.out.println(max);
		System.out.println(count);
	}

	public static int[] input() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100);
			int t=rd.nextInt(100);
			//if (t % 2 == 0)
				//t++;
			//arr[i]=t;
		}
		return arr;
	}

	public static void output(int[] n) {
		for (int i : n)
			System.out.print(i + " ");
		System.out.println();
	}
}
