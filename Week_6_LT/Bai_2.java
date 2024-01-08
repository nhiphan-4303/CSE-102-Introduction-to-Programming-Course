
// 
import java.util.Random;
import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int n = sc.nextInt();// số lượng phần tử trong dãy
		int[] arr = new int[n];

		// input
		for (int i = 0; i < arr.length; i++)
			arr[i] = rd.nextInt(100);
		// arr[i] = sc.nextInt();

		// output
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + " ");

	}

}
