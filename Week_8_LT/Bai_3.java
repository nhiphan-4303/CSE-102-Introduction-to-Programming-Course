
//Nhập vào 1 số K, tìm phần tư lớn nhất trong dãy sao cho phần tử đó vẫn <=K
//Nhập vào 1 số K, tìm cặp phần tử có tổng lớn nhất và <=K.
import java.util.Random;
import java.util.Scanner;

public class Bai_3 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int[] a = input();
		output(a);
		System.out.println("Nhap K: ");
		int k = sc.nextInt();
		maxSum(k, a);

	}

	public static void maxSum(int k, int[] a) {
		boolean flag = false;
		int item_1 = 0;
		int item_2 = 0;
		int max_sum = Integer.MIN_VALUE;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int sum = a[i] + a[j];
				if (a[i] != a[j] && sum > max_sum && sum <= k) {
					flag = true;
					max_sum = sum;
					item_1 = a[i];
					item_2 = a[j];
				}
			}
		}
		if (flag) {
			System.out.println("Hai phan tu co tong lon nhat va nho hon k la: " + item_1 + " va " + item_2);
		}
		else
			System.out.println("Not found");

	}

	public static void findEle(int k, int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= k && a[i] > max) {
				max = a[i];
			}
		}
		if (max == Integer.MIN_VALUE) {
			System.out.println("Khong co so nao nho hon K.");
		} else
			System.out.println("So lon nhat nho hon K la: " + max);

	}

	public static int[] input() {
		Random rd = new Random();
		System.out.println("Nhap size cua mang: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100);

		}
		return arr;
	}

	public static void output(int[] a) {
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
	}
}
