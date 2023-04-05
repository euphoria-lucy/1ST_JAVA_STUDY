package Method;

//학과(1,2,3)를 입력 받아 해당 학과를 출력하는 프로그램을 출력하라.

import java.util.Scanner;
public class Major{
 public static void main(String args[ ]){

	// 입력
	// 1. 데이터 → 변수, 상수 선언
	Scanner sc = new Scanner(System.in);
	int number;
	System.out.print( "학과 입력 :  " );
	number = sc.nextInt( );

	// 학과구분 메서드 호출
	System.out.print( "전공 :  " + getMajor( number ) );
 } // main

	public static String getMajor( int number ){
	    String result;
	    switch( number ){

		case 1 : result = "뉴미디어소프트웨어과"; break;
		case 2 : result = "뉴미디어웹솔루션과"; break;
		case 3 : result = "뉴미디어디자인과"; break;
		default : result = "해당하는 학과가 없습니다."; break;
	
	    }
	    return result;

	}
} // class
