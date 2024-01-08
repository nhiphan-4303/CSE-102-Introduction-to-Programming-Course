//in tổng các số lẻ từ 0 đến 10
public class Bai_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int s = 0;
		for (int i = 0; i < a; i++) {
			if (i % 2 == 0) {
				continue;
			}
			s = s + i;
		}
		System.out.println(s);

	}

}
