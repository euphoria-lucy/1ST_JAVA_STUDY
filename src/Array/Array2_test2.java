package Array;

public class Array2_test2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// 1. 선언
			int[][] a;
			// 2. 생성
			a = new int[2][3];
			// 3. 선언 + 생성
			// int[][] b = new int[3][4];
			// int c[][] = new int[3][4];
			
			// 4-1. 초기화
			a[0][1] = 1; // 열-1 = 입력, 행-1 = 입력
			a[1][0] = 3;
			a[1][2] = 5;
			
			for(int i = 0; i < a.length; i++) { // i : 행
				for (int j = 0; j < a[i].length; j++ ) { // j : 열
					System.out.print(a[i][j] + " ");
				}
				System.out.println(""); // 밑으로 가기 위해 설정
			}
			
			// 4-2.초기화
			int[][] b = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
			
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b[i].length; j++) {
					System.out.print(b[i][j] + " ");
				}
				System.out.println("");
			}
			// 4-3.초기화
			int[][] d = {{3, 5, 7, 9}, {11, 13, 15, 17}};
			
			for (int i = 0; i < d.length; i++) {
				for (int j = 0; j < d[i].length; j++) {
					System.out.print(d[i][j] + " " + "\t");
				}
				System.out.println("");
			}
			
			// 4-4. 초기화
			int [][] c = new int[3][4];
			int k = 3;
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[i].length; j++) {
					c[i][j] = k++;
					System.out.print(c[i][j] + "\t ");
				}
				System.out.println("");
			}
		}

	}
