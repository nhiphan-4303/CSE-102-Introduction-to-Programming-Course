
/*1 tên trộm đột nhập vào 1 ngôi nhà, trong nhà có n món đồ vật, có
lần lượt trọng lượng là Wi, cho biết tên trộm có thể vác được món đồ
có trọng lượng tối đa là M, hãy cho biết cân nặng món đồ trong nhà mà
tên trộm có thể mang đi được.
EX: 
input:
n = 6
20 15 70 46 39 12
m = 30
output: 20*/
import java.util.Random;
import java.util.Scanner;

public class Bai_1_HW {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) {
		int[] arr = input();
		output(arr);
		System.out.println("Nhap trong luong ma ten trom co the vac duoc: ");
		int m = sc.nextInt();
		item(m, arr);

	}

	public static void item(int m, int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= m && a[i] > max) {
				max = a[i];
			}

		}
		if (max == Integer.MIN_VALUE) {
			System.out.println("Ten trom khong tim duoc mon do nao.");
		} else
			System.out.println("Mon do ten trom co the lay duoc la: " + max);

	}

	public static void output(int[] a) {
		for (int x : a)
			System.out.print(x + " ");
		System.out.println();
	}

	public static int[] input() {
		System.out.println("Nhap size cua mang: ");
		int size = sc.nextInt();

		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = rd.nextInt(100);
		}
		return a;
	}

}
