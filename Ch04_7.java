package Ch04;

public class Ch04_7 {
	// Q7 "Hello, world, �j�a�n �@�����@�� �P����������

	public static void main(String[] args) {
		String s = "Hello, world, �j�a�n"; // 17

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
