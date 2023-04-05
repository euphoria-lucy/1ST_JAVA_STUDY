package DataType;

import java.util.Scanner;

public class Score_1210 {

	public static void main(String args[ ]){

		Scanner sc = new Scanner(System.in);
		double kor, eng, math, java, total, average;
		
		System.out.print("국어 점수 : ");
		kor = sc.nextDouble( );
		System.out.print("영어 점수 : ");
		eng = sc.nextDouble( );
		System.out.print("수학 점수 : ");
		math = sc.nextDouble( );
		System.out.print("자바 점수 : ");
		java = sc.nextDouble( );
		total = kor+eng+math+java;
		average = total/4;


		System.out.println("네 과목의 점수 합계 : " + total);
		System.out.println("네 과목의 점수 평균 : " + String.format("%.2f", average)); // System.out.printf("네 과목의 점수 평균 : %.2f", average)로 가능 → 이것이 훨씬 좋음  println은 숫자를 문자로 인식함.

	    }
	
}
