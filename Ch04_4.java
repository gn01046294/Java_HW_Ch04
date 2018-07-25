package Ch04;

public class Ch04_4 {

	public static void main(String[] args) {
		// 寫一個程式利用for 於螢幕印出 1 4 9 16 25 36 49 64 81 100
		int x = 1, y = 1;
		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) {

				// if (x * y < 10) {System.out.print(" " + y * x + " ");}
				// else if (x * y >= 10 & x * y < 100) {System.out.print(" " + y * x + " "); }
				// if (x * y == 100) {System.out.println(x * y);}

				System.out.printf("%3d ", x * y);
			}
			System.out.println();
		}
	}

}
