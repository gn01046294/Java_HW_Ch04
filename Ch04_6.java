package Ch04;

public class Ch04_6 {
//Q6
	public static void main(String[] args) {
		// Q6
		int x = 1, y = 1;
		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) {

				if (x * y < 10) {System.out.print("  " + y * x + " ");} 
				              else if (x * y >= 10 & x * y < 100) {System.out.print(" " + y * x + " ");				}
				                 if (x * y == 100) {System.out.println(x * y);}
				
				//System.out.printf("%3d ", x*y);                    //���i�H�Υ��䨺�@��{�����X�M�W�����T��{���@��
			}
			System.out.println();
		}
	}

}
