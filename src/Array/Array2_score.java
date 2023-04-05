package Array;

import java.util.Scanner;
public class Array2_score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] item = {"완성도", "창의성", "이해도"}; // 항목별 배열 설정
		int[][] score = new int[5][3]; // 세 개 항목의 점수 배열 설정
		int[] total = new int[5]; // 합산한 점수 배열 설정
		int max = total[0]; // 최고점수 배열 설정

		// 결과 입력하기
		for (int i = 0; i < score.length; i++) { 
			for (int j = 0; j < score[i].length; j++) {
					System.out.print((i+1) + "팀의 "+ item[j] + "점수를 입력하세요 : "); // "i+1"은 몇 번째 팀을 의미하는지, "item[j]"는 item 배열을 나타내기 위해 설정
					score[i][j] = sc.nextInt();
			}
		}
		
		// 결과 출력하기
		int team = 1; //최고 팀 변수 설정
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				total[i] += score[i][j];
			}
			if (max < total[i]) { // max가 total[i]보다 작으면 이라는 조건 설정
				max = total[i]; // max가 total[i]가 되도록 설정
				team = i+1; // team은 i+1로 되어 최고 팀 나올 수 있게 설정
			}
		}
		System.out.println("최고팀 : " + team + "번째 팀 → 점수 : " + max);
	}
}
