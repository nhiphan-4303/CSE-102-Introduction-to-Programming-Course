import java.util.Scanner;

public class Bai_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 1 diem trung binh cua hoc sinh: ");
		double avg = sc.nextDouble();
		int nguyen = (int)(avg);
		double le = avg - nguyen;

		if (le > 0.5)
			System.out.println(nguyen + 1);
		if (le < 0.5)
			System.out.println(nguyen);
		if (le == 0.5)
			System.out.println(avg);
		sc.close();

	}

}
