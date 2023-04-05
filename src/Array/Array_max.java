package Array;

/* 10명의 점수를 입력 받아 최고 점수를 받은 학생을 결정하는 프로그램을 작성하라
   1. Scanner를 통해 입력 받아 score 배열에 점수를 저장하라.
   2. score 배열은 정수형이고 길이는 10이다.
   3. 최대값을 결정하기 위한 변수 max를 사용하라. 
   4. 점수범위 말고 다른 점수가 들어오면 다시 입력할 수 있게 하라*/

import java.util.Scanner;
public class Array_max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[10]; // 10개의 입력받은 수 저장하기 위해 설정

		for (int i = 0; i < score.length; i++ ) { // for문 사용해 score[i] 범위 설정
			System.out.print((i + 1) + "번째 점수를 입력하세요 :  "); // 점수입력하라고 나타내기 위해 설정
			do {
				score[i] = sc.nextInt(); // score[i]가 입력받을 수 있도록 설정
				
				if(score[i] < 0 || score[i] > 100) System.out.print("다시 입력해주세요 : "); // score[i]가 0보다 작거나 score[i]가 100보다 크면 "다시 입력하세요"라는 문구 출력 설정
			} while(score[i] < 0 || score[i] > 100); // score[i]가 0보다 작거나 score[i]가 100보다 클 때까지 반복할 수 있게 설정
		}
		int max = score[0]; // score[0]으로 초기화

		for (int i = 0; i < score.length; i++ ) {	// score의 길이보다 작을 때까지 반복계산하기 위해	설정	
			if (score[i] > max ) { // 최고 점수를 구분해야 하기 때문에 "score[i]가 max보다 크면"이라는 조건을 넣어 조건문을 사용
				max = score[i]; // max는 score[i]가 최고점수가 나타날 때까지 변경됨
			}
		}
		System.out.println("최고 점수를 받은 학생은 " + max + " 점 입니다."); // 결과 출력
	}

}
