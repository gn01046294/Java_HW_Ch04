package Ch04;

public class Ch04_7 {
	// Q7 "Hello, world, 大家好 一次取一個 與它對應的值

	public static void main(String[] args) {
		String s = "Hello, world, 大家好"; // 17

		for (int n = 0; n < s.length(); n++) {

			System.out.print(s.charAt(n) + "    ");
			int i = s.charAt(n);
			if (i < 100) {
				System.out.println(" " + i);
			} else {
				System.out.println(i);
			}
		}

	}

}
