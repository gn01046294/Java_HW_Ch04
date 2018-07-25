package Ch04;

//由程式算出1-10的連乘積 用for while

public class Ch04_3 {

	public static void main(String[] args) {

		// int i = 1, sum = 1;
		// for (i = 1; i <= 10; i++) {
		// sum *= i;
		//
		// }
		// System.out.println("1-10連乘積:" + sum);
		int i = 1, sum = 1;
		while (i <= 10) {
			sum *= i;

			i++;
		}
		System.out.println("1-10連乘積:" + sum);
	}

}
