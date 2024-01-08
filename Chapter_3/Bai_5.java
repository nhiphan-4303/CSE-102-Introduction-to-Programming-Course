//Input a 3 digits integer n. Output 3 digits in incremental order (suppose 3 digits are different)..
import java.util.Scanner;

public class Bai_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3 difits integer number: ");
		int n = sc.nextInt();

		int c = n % 10;
		int b = (n / 10) % 10;
		int a = n / 100;
		
		int max = a;
		if (b > max)
			max = b;

		if (c > max)
			max = c;
		System.out.println("Max = " + max);

		int min = a;
		if (b < min) 
			min = b;
		
		if (c < min) 
			min = c;
		System.out.println("Min = " + min);

		int total = a+b+c;
		int mid = total - max - min;

		System.out.println(min + "" + mid + "" + max);
		sc.close();
	}

}
// sua bai 
// if(a>b){
// a = a+ b;
//b=a-b;
//a=a-b;
//}
//if(b>c);
//b=b+c;
//c=b-c;
//
