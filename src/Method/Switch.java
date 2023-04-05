package Method;

/* 두 수를 입력 받아 두 수를 바꿔 출력하는 
프로그램 키보드로 입력받아 a,b를 바꿔 출력하는 프로그램
ex) a = 5, b = 3으로 입력받으면 a = 3, b = 5로 출력됨
두 개의 값을 스위치(switch)로 한다. 
파일이름은 Switch.java로 한다. */

import java.util.Scanner;

public class Switch{
public static void main(String args[ ]){

Scanner sc = new Scanner(System.in);
System.out.print("첫번째 숫자 입력 :  ");
int num1 = sc.nextInt( );
System.out.print("두번째 숫자 입력 :  ");
int num2 = sc.nextInt( );
getChange( num1, num2 );

} // main

public static void getChange( int num1, int num2 ){
	int temp = 0;
	temp = num1;
	num1 = num2;
	num2 = temp;
	System.out.print( num1 + " " + num2 );
} // getChange

} // end
