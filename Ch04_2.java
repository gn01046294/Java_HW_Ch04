package Ch04;

//程式算出1-1000的偶數和

public class Ch04_2 {

	public static void main(String[] args) {

		int i = 1, sum = 0;

		for (i = 2; i <= 1000; i += 2) {
			sum += i;

		}
		System.out.println("1~1000偶數和=" + sum);
	}

}
