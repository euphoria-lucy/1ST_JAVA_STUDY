package Array;

public class ArrayExam13 {

	public static void main(String[] args) {
		int[][] a = new int[4][4];
		int num = 1;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				a[i][j] = num++; // 1부터 출력될 수 있게 설정
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}

