package Array;

import java.util.Scanner;

public class Array_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[10];
		
		for (int i = 0; i < score.length; i++ ) { 
			System.out.print((i + 1) + "번째 점수를 입력하세요 :  "); 
			do {
				score[i] = sc.nextInt(); 
				
				if(score[i] < 0 || score[i] > 100) System.out.print("다시 입력해주세요 : ");
			} while(score[i] < 0 || score[i] > 100); 
		}
		
		doSort(score);
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}
		

	}
	
	public static int[] doSort(int[] score) {// public static void doSort(int[] score, int temp)
		int temp = 0;
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) { // 오름차순
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		return score;
	} 

}

