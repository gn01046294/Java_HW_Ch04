package Ch04;

public class Ch04_1 {

	// �g�@�ӵ{����1-100����10�ӼƦr ��X�L�̪��`�M�P����

	public static void main(String[] args) {
		int sum = 0;
		for (int x = 1; x <= 10; x++) {

			int i = (int) (Math.random() * 100) + 1;
			System.out.println(i);
			sum += i;
		}

		System.out.println("�`�M:" + sum);
		System.out.println("����:" + sum / 10);
	}

}
