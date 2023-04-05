package Array;

public class ArrayExam14 {

	public static void main(String[] args) {
		int[][] a = new int[4][];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = new int [i+1]; // 각 행에 대해 열을 생성 '[0] → 1열'의 의미
		}
		
		int k = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = k++;
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
	}
} 
