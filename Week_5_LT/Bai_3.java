/*hàm kiểm tra 1 số có là số hoàn hảo hay không, hàm này nhận đầu vào là 1 số nguyên dương n, sau khi kiểm tra thì trả kết quả về là, 
nếu đúng thì trả về true, ngược lại thì trả về false.*/
//in ra các số hoàn hảo từ 1 đến 10000

import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i =1; i<9999; i++)
			if(isPerfectNumber(i))
				System.out.println(i);

		/*System.out.println("Enter the positive integer number: ");
		long n = sc.nextLong();
		if (isPerfectNumber(n))
			System.out.println("yes");
		else
			System.out.println("no");*/
		sc.close();

	}

	public static boolean isPerfectNumber(long n) {
		long sum = 0;
		for (long i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return (n == sum) ? true : false;

	}
}
