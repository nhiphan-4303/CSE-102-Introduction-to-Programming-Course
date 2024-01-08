
//Viết hàm tính tổng các phần tử chẵn trong dãy.
import java.util.Random;
import java.util.Scanner;

public class Bai_2_nhi {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = input();
		output(a);
		System.out.println("\n" + "Cac so chan la: ");
		listChan(a);
		System.out.println("\n" + "Tong cac so chan la: ");
		System.out.println(S(a));

	}

	public static int S(int a[]) {
		int S = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				S += a[i];
		}
		return S;
	}

	public static void listChan(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.print(a[i] + " ");
		}
	}

	public static void output(int a[]) {
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	public static int[] input() {

		System.out.println("Nhap vao size cua mang: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		Random rd = new Random();
		for (int i = 0; i < size; i++) {
			arr[i] = rd.nextInt(100);
		}
		return arr;
	}

}
