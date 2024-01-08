
public class Bai_1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int s = 30;
			int m = 20;
			int h = 1;
			
			int time = (h*3600 + m*60 + s);
			
			System.out.println(time + "s");
			
			int second = time;
			
			int change_h = (second/3600);
			second = (second%3600);
			int change_m = (second/60);
			int change_s = (second%60);
			
			System.out.println(change_h + "h" + change_m + "m" + change_s + "s");
			
		}

	}

