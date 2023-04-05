package Method;

//두 수를 입력받아 크기를 비교하는 프로그램을 작성하라.

import java.util.Scanner;

public class CompareTwo{
 public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);
	System.out.print("두 숫자 입력 (스페이스로 분리) :  ");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	compareOfTwo( num1, num2 );

 } //main

 public static void compareOfTwo( int num1, int num2 ){
	if( num1 > num2 ){
		System.out.println(num1 + " 이 " + num2 + " 보다 크다");
	}else if( num1 == num2 ){
		System.out.println(num1 + " 과 " + num2 + " 가 같다");
	}else{
		System.out.println(num2 + " 이 " + num1 + " 보다 크다");
	}
 }
}
