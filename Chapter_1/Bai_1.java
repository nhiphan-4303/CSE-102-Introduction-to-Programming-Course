//Giving an integer m, find the absolute value of n
import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		if (n<0){
			System.out.println(-n);
		} else {
			System.out.println(n);
		}
		sc.close();

	}

}
