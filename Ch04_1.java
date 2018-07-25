package Ch04;

public class Ch04_1 {

	// 寫一個程式由1-100產生10個數字 算出他們的總和與平均

	public static void main(String[] args) {
		int sum = 0;
		for (int x = 1; x <= 10; x++) {

			int i = (int) (Math.random() * 100) + 1;
			System.out.println(i);
			sum += i;
		}

		System.out.println("總和:" + sum);
		System.out.println("平均:" + sum / 10);
	}

}
